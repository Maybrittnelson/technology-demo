# technology-demo

>1-01 的代码在分支 feature/1-01上，依次类推
>
>mybatis中切勿将mysql关键字，命名为表字段名称，例如desc

### 1-02

#### 修复1-01代码，添加自创TypeHandler

* 需要使用如下标注的文件：

<img src="https://github.com/Maybrittnelson/technology-demo/blob/featrue/1-02/springboot-mybatis-demo/img/xiufu1_handler.jpg?raw=true" width="80%" height="800px">

* 产生新的问题，org.apache.ibatis.type.BaseTypeHandler#setConfiguration并没有真正注入congiguration

  * [issues](https://github.com/mybatis/mybatis-3/issues/1203)

  * [fix](https://github.com/kazuki43zoo/mybatis-3/commit/18e0ed3f29cc91c3daa7579b9523a98018a5d47d)

  * 学着[fix](https://github.com/kazuki43zoo/mybatis-3/commit/18e0ed3f29cc91c3daa7579b9523a98018a5d47d)抄了一段代码，在package com.geshaofeng.springbootmybatisdemo.test。

  * 发现null可以向下转型。

    ​
#### [MyBatis Generator](http://www.mybatis.org/generator/)

* 需要使用如下标注的文件：

  <img src="https://github.com/Maybrittnelson/technology-demo/blob/featrue/1-02/springboot-mybatis-demo/img/generator_order.jpg?raw=true" width="80%" height="800px">

   * 1为自动生成前所需配置文件

   * 2为自动生成的文件

   * 3为使用自动生成文件的文件

     ​

#### [MyBatis Spring Boot 整合](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

* 需要使用如下标注的文件：

  <img src="https://github.com/Maybrittnelson/technology-demo/blob/featrue/1-02/springboot-mybatis-demo/img/sqlSessionTemplate_order.jpg?raw=true" width="80%" height="800px">

  	* 阅读顺序：1->6

  ​

