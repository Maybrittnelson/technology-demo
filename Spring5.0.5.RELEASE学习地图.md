[TOC]

# Spring5.0.5.RELEASE学习地图

## [Core](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#spring-core)

IoC container, Events, Resources, i18n, Validation, Data Binding, Type Conversion, SpEL, AOP.

### 1. The IoC container

#### [1.1. Introduction to the Spring IoC container and beans](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#beans-introduction)

##### 1.1.1 the Spring Ioc container

* Spring Ioc Container = Ioc + Container（Ioc是Process，Container(容器)是操作这个Process的主体）

  * Ioc = 容器创建对象 + DI 或者 Ioc = 容器创建对象，所以 IoC is also known as *dependency injection* (DI)
    * 容器创建对象
      * 容器创建对象的方式：it is constructed or returned from a factory method
      * 容器创建对象的时机：当*lazy-init*为false（false也是lazy-init默认值）时，创建容器时，创建对象，并DI；当*lazy-init*为true时，获取bean时，创建对象，并DI。
    *  *dependency injection* (DI)
      * DI的方式：constructor arguments；arguments to a factory method；properties that are set on **the object instance** （容器创建的对象）
      * DI的时机：The container then *injects* those dependencies **when it creates the bean**（）。

  * Container：BeaFactory、[`ApplicationContext`](https://docs.spring.io/spring-framework/docs/5.0.5.RELEASE/javadoc-api/org/springframework/context/ApplicationContext.html) is a sub-interface of `BeanFactory`这两个都是Container。

##### 1.1.2 Introduction to beans

A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans, and the *dependencies* among them, are reflected in the *configuration metadata* used by a container.

####  [1.6. Customizing the nature of a bean](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#beans-factory-nature)

##### [1.6.1. Lifecycle callbacks](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#beans-factory-lifecycle)

To interact with the container’s management of the bean lifecycle, you can implement the Spring `InitializingBean` and `DisposableBean` interfaces. The container calls `afterPropertiesSet()` for the former and `destroy()` for the latter to allow the bean to perform certain actions upon initialization and destruction of your beans.

* ##### Initialization callbacks

  The `org.springframework.beans.factory.InitializingBean` interface allows a bean to perform initialization work after all necessary properties on the bean have been set by the container. The `InitializingBean` interface specifies a single method:

### [2. Resources](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#resources)

#### [2.1. Introduction](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#resources-introduction)

Java’s standard `java.net.URL` class and standard handlers for various URL prefixes unfortunately are not quite adequate enough for all access to low-level resources. For example, there is no standardized `URL` implementation that may be used to access a resource that needs to be obtained from the classpath, or relative to a `ServletContext`. While it is possible to register new handlers for specialized `URL` prefixes (similar to existing handlers for prefixes such as `http:`), this is generally quite complicated, and the `URL` interface still lacks some desirable functionality, such as a method to check for the existence of the resource being pointed to.

#### [2.2. The Resource interface](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#resources-resource)

#### [2.3. Built-in Resource implementations](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#resources-implementations)

#### [2.4. The ResourceLoader](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#resources-resourceloader)

#### [2.5. The ResourceLoaderAware interface](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#resources-resourceloaderaware)

#### [2.6. Resources as dependencies](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#resources-as-dependencies)

#### [2.7. Application contexts and Resource paths](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/core.html#resources-app-ctx)



##     [Testing](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/testing.html#testing)

Mock objects, TestContext framework, Spring MVC Test, WebTestClient.

## [Data Access](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/data-access.html#spring-data-tier)

Transactions, DAO support, JDBC, ORM, Marshalling XML.

## [Web Servlet](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/web.html#spring-web)

Spring MVC, WebSocket, SockJS, STOMP messaging.

## [Web Reactive](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/web-reactive.html#spring-webflux)

Spring WebFlux, WebClient, WebSocket.

## [Integration](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/integration.html#spring-integration)

Remoting, JMS, JCA, JMX, Email, Tasks, Scheduling, Cache.

##                        [Languages](https://docs.spring.io/spring/docs/5.0.5.RELEASE/spring-framework-reference/languages.html#languages)

Kotlin, Groovy, Dynamic languages.

