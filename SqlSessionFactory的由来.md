[TOC]



# SqlSessionFactory的由来问题

## [问题由来节选](http://www.mybatis.org/spring/getting-started.html#)

### Getting Started

### Installation

### Quick Setup

```xml
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
  <property name="dataSource" ref="dataSource" />
</bean>
```

```xml
<bean id="userMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
  <property name="mapperInterface" value="org.mybatis.spring.sample.mapper.UserMapper" />
  <property name="sqlSessionFactory" ref="sqlSessionFactory" />
</bean>
```

## 问题描述

org.mybatis.spring.support.SqlSessionDaoSupport#setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)注入类型为sqlSessionFactory，但是配置的sqlSessionFactory为org.mybatis.spring.SqlSessionFactoryBean？

## 问题解决步骤

1. sqlSessionFactory //Find Usages /value wrirte
2. 在org.mybatis.spring.SqlSessionFactoryBean#afterPropertiesSet打断点启动，
3. 哈哈进来了
## 代码时序图
<img src="https://github.com/Maybrittnelson/technology-demo/blob/feature/1-03/img/SqlSessionFactoryBean%20%E4%BA%A7%E7%94%9F%20SqlSessionFacory%E7%9A%84%E6%97%B6%E5%BA%8F%E5%9B%BE.png"/>

## 问题之外

### 了解org.springframework.beans.factory.InitializingBean

### 了解org.springframework.beans.factory.FactoryBean



