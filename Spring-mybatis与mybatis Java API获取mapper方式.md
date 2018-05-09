# Spring-mybatis与mybatis Java API获取mapper方式

## mybatis Java API

### SqlSessions

#### SqlSessionFactoryBuilder

#### SqlSessionFactory

#### SqlSession

##### Statement Execution Methods

##### Batch update statement Flush Method

##### Transaction Control Methods

##### Local Cache

##### Ensuring that SqlSession is Closed

##### Using Mappers

获取起点：org.apache.ibatis.session.defaults.DefaultSqlSession#getMapper

```
<T> T getMapper(Class<T> type)
```

##### Mapper Annotations

## Spring-mybatis

### Registering a mapper

#### With XML Config

获取起点（注入时调用）：org.mybatis.spring.mapper.MapperFactoryBean#getObject

```
<bean id="userMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
  <property name="mapperInterface" value="org.mybatis.spring.sample.mapper.UserMapper" />
  <property name="sqlSessionFactory" ref="sqlSessionFactory" />
</bean>
```

#### With Java Config

获取起点：org.mybatis.spring.SqlSessionTemplate#getMapper

```
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
      SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
      sqlSessionFactory.setDataSource(dataSource());
      return (SqlSessionFactory) sqlSessionFactory.getObject();
    }

    @Bean
    public UserMapper userMapper() throws Exception {
      SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
      return sessionTemplate.getMapper(UserMapper.class);
    }
```

### Scanning for mappers

获取起点（注入时调用）：org.mybatis.spring.mapper.MapperFactoryBean#getObject

There is no need to register all your mappers one by one. Instead, you can let MyBatis-Spring scan your classpath for them.

There are three different ways to do it:

- Using the `<mybatis:scan/>` element.
- Using the annotation `@MapperScan`
- Using a classic Spring xml file and registering the `MapperScannerConfigurer`

# 以上几种获取方式其实都是 org.apache.ibatis.session.Configuration#getMapper

## org.apache.ibatis.session.Configuration#getMapper做了什么

