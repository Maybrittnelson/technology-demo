# technology-demo

>1-01 的代码在分支 feature/1-01上，依次类推
>
>mybatis切勿将mysql关键字为表字段名称，例如desc

### 1-01

<img src="https://raw.githubusercontent.com/Maybrittnelson/technology-demo/master/springboot-mybatis-demo/img/exception.jpg" width="80%">

#### 行者常至

**运行对应分支上的代码，出现如上异常**

* 通过异常打印顺序可知
  * 调用方法顺序为：最先**first**，最后调用的是**last**
  * 异常抛出在**last**，捕获在**last-catch**

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

### 1-02

