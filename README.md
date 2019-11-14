# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/maven-plugin/)

###1.架构说明
#### kkcloud为父结构
* kk-tools 为工具类，未继承kkcloud的pom.xml
* kk-common 为公共的数据访问服务，如用户信息登陆等
* kk-eureka服务注册中心
* kk-server为服务提供方或调用方，目前暂当作提供方
* kk-client 目前作为调用方，也可作为提供方
* kk-zuul为网关，根据需要进行服务映射控制，所有服务都可以直接调用网管进行访问
 如：访问kk-client服务时需要访问 http://localhost:8765/ribbon?name=lixy
 通过配置zuul配置：
 server:
   port: 8888
 zuul:
   routes:
     api-kkclient:
       path: /kkclient/**
       serviceId: service-feign

* 此时，直接访问：http://localhost:8888/kkclient/ribbon?name=lixy即可       

* Spring Cloud Zuul路由是微服务架构的不可或缺的一部分，提供动态路由，监控，弹性，安全等的边缘服务。Zuul是Netflix出品的一个基于JVM路由和服务端的负载均衡器

#### SpringCloud微服务框架搭建
* https://www.jianshu.com/p/99e73105f201
#### 服务网关zuul初级篇
* http://www.ityouknow.com/springcloud/2017/06/01/gateway-service-zuul.html
#### 服务网关Zuul高级篇 
* http://www.ityouknow.com/springcloud/2018/01/20/spring-cloud-zuul.html
#### Spring Cloud 系列文章
http://www.ityouknow.com/spring-cloud