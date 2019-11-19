"# config-client_demo" 

# config-client 配置中心客户端(实际项目中是各个服务)

本服务注册到consul中，通过服务发现的方式找配置中心服务
主要依赖
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```
bootstrap.yml配置
```json
spring:
  cloud:
    consul:
      # consul服务器地址
      host: 127.0.0.1
      discovery:
        heartbeat:
          enabled: true
    config:
      discovery:
        enabled: true
        service-id: config-server-demo
      # 使用用户名和密码连接配置中心，如果config-server配置了用户名、密码的话
      username: user
      password: dddd
      profile: dev
```
> **注意**: 以上属性应配置在bootstrap.yml，而不是application.yml中。如果配置在application.yml中，该部分配置就不能正常工作。例如，Config Client会连接spring.cloud.config.uri的默认值 http://localhost:8888 ，而并非我们配置的 http://localhost:8080/ 。

