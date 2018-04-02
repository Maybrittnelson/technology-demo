# technology-demo

>1-01 的代码在分支 feature/1-01上，依次类推

### 1-01

<img src="https://raw.githubusercontent.com/Maybrittnelson/technology-demo/master/springboot-mybatis-demo/img/exception.jpg" width="80%">

#### 行者常至

**运行对应分支上的com.geshaofeng.springbootmybatisdemo.demo.MyBatisXmlConfigurationDemo.main()，出现如上异常**

* 通过异常打印顺序可知
  * 调用方法顺序为：最先**first**，最后调用的是**last**

  * 异常抛出在**last**，捕获在**last-catch**

    ​

* 问题产生原因分析

  * 定位到configuration.getMappedStatement(statement)，即**last**下一行。

  * ```java
    //在[pdf](https://github.com/Maybrittnelson/technology-demo/tree/master/springboot-mybatis-demo/pdf)，中搜索selectOne，然后理解下面的1、2。
    //1.mappedStatements的含义
    //2.statement(id)的含义
    public class Configuration {
        
    protected final Map<String, MappedStatement> mappedStatements = new StrictMap<MappedStatement>("Mapped Statements collection");

    public MappedStatement getMappedStatement(String id) {
        return this.getMappedStatement(id, true);
      }

     public MappedStatement getMappedStatement(String id, boolean validateIncompleteStatements) {
        if (validateIncompleteStatements) {
          buildAllStatements();
        }
        return mappedStatements.get(id);
      }
    ```

  * mappedStatements在mybatis-config.xml中对应

     ```xml
     <mappers>
            <mapper resource="mybatis/mapper/UserMapper.xml"/>
      </mappers>
     ```

     ​

  * statement(id) = com.geshaofeng.springbootmybatisdemo.mapper.UserMapper.selectOneUser

    ```xml

    <!--根据dtd复制-->
    <!DOCTYPE mapper
            PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
            "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
    <!--如果没有namespace:img/exception_2-->
    <mapper namespace="com.geshaofeng.springbootmybatisdemo.mapper.UserMapper">
        <select id="selectOneUser" parameterType="int" resultMap="usermap">
            SELECT id,username,password FROM user WHERE id = #{id}
        </select>
    </mapper>
    ```

  ​

  * 正确代码见feature/1-02

#### 处处留心皆学问

* 截取**last-catch**代码片段，观看1->3

```java
  
	@Override
  public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
    try {
      MappedStatement ms = configuration.getMappedStatement(statement);
      return executor.query(ms, wrapCollection(parameter), rowBounds, Executor.NO_RESULT_HANDLER);
    } catch (Exception e) {
      //1
      throw ExceptionFactory.wrapException("Error querying database.  Cause: " + e, e);
    } finally {
      ErrorContext.instance().reset();
    }
  }


public class ExceptionFactory {
  private ExceptionFactory() {
    // Prevent Instantiation
  }

  public static RuntimeException wrapException(String message, Exception e) {
      //2
    return new PersistenceException(ErrorContext.instance().message(message).cause(e).toString(), e);
  }
}

public class ErrorContext {
  private static final ThreadLocal<ErrorContext> LOCAL = new ThreadLocal<ErrorContext>();

  private ErrorContext stored;
  private String resource;
  private String activity;
  private String object;
  private String message;
  private String sql;
  private Throwable cause;

  private ErrorContext() {
  }

  public static ErrorContext instance() {
    //3 单利模式
    ErrorContext context = LOCAL.get();
    if (context == null) {
      context = new ErrorContext();
      LOCAL.set(context);
    }
    return context;
  }

```

