[TOC]



## Spring相关问题

[Spring5.0.5.RELEASE学习地图](https://github.com/Maybrittnelson/technology-demo/blob/feature/3-02/Spring5.0.5.RELEASE%E5%AD%A6%E4%B9%A0%E5%9C%B0%E5%9B%BE.md)

### Round One

#### 1 理解Annotation方式的IOC实现原理，并画出UML图。
##### 解
1. 按照文档中的[Instantiating the Spring container using AnnotationConfigApplicationContext](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#beans-java-instantiating-container)，配置demo。
2. debug过程中需要重复这一步，直至注册完成（在那一刻你学会了，有根据的猜想，并验证）：注意beanFactory中的org.springframework.beans.factory.support.DefaultListableBeanFactory#beanDefinitionMap，在哪一步有了自己配置的bean，如果有了，断点。
##### 答
<img src="https://github.com/Maybrittnelson/technology-demo/blob/feature/3-02/img/Spring%20AnnotationConfigApplicationContext%20%E6%96%B9%E5%BC%8F%E5%AE%9E%E7%8E%B0%E6%97%B6%E5%BA%8F%E5%9B%BE.png" />

### Round Two

#### 1 理解IOC注入原理，并画出UML图
##### 解
略
##### 答
<img src="https://github.com/Maybrittnelson/technology-demo/blob/feature/3-02/img/Spring%20Ioc%E5%8A%A0%E8%BD%BDBean%E7%9A%84%E8%BF%87%E7%A8%8B.png" />

#### 2 理清BeanDefinition、BeanWrapper和原生Bean之间的关系，想一想为什么要这样设计



