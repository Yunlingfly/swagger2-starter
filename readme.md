# **swagger-spring-boot-starter**

制作by: yunlingfly@CSDN

博客：https://blog.csdn.net/weixin_38187317

2019-3-12

引入方式：

    <dependency>
      <groupId>cn.yunlingfly</groupId>
      <artifactId>swagger-spring-boot-starter</artifactId>
      <version>0.1-RELEASE</version>
    </dependency>

使用：

修改application.yml添加一下参数：

    swagger:
      title: "标题"
      contact:
        name: "维护人"
        email: 
        url: 
      version: "版本"
      description: "描述"
      base-package: "swagger扫描的基础包，必填"
      base-path: "需要处理的基础URL规则，默认：/**"
      #  exclude-path: "需要排除的URL规则，目前没做"
      license: "许可证"
      license-url: ""

在项目启动类使用下面的注解：

    import cn.yunlingfly.swaggerspringbootstarter.EnableYLFSwagger2;
    @EnableYLFSwagger2