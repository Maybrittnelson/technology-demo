[TOC]



## Mybatis相关问题

### Round One

#### 1 Mapper在spring管理下其实是单例，为什么可以是一个单例？ (而Mybatis中提示线程不安全)
##### 解
[Spring-mybatis与mybatis Java API获取mapper方式](https://github.com/Maybrittnelson/technology-demo/blob/feature/1-03/Spring-mybatis%E4%B8%8Emybatis%20Java%20API%E8%8E%B7%E5%8F%96mapper%E6%96%B9%E5%BC%8F.md)
##### 答
因为根据Mapper接口，动态代理生成的Mapper代理类，该类执行方法时，调用代理方法，接着SqlSession中调用curd方法。此时区别产生：spring中的SqlSessionTemplate，调用org.mybatis.spring.SqlSessionTemplate.SqlSessionInterceptor#invoke，获取线程级别单例的DefaultSqlSession实例。而mybatis javaApi操作，直接调用DefaultSqlSession实例方法会出错。

##### 扩展题：那Spring为什么不用SqlSessionManager

spring中SqlSessionTemplate用的SqlSessionFactory包装的key，可以更细粒度的区分SqlSession，而SqlSessionManagerThreadLocal绑定的只是SqlSession。

#### 2 TypeHandler手写

#### 3手写Plugin,多个interceptor到底谁先执行？顺序由谁决定的？ 
