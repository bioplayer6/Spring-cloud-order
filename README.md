Spring-cloud-order

2021-6 外卖订餐系统

项目前言:该项目是我在b站中学习Spring Cloud所学做的一个小demo，b站链接https://www.bilibili.com/video/BV1W4411V7fu
，通过在视频中边听讲解，边跟着敲代码实践，让我学到了很多之前没接触过的东西,
比如Spring Cloud Config，可以把多个微服务配置文件统一集中管理，又或者说是VO包，是对前后端数据对接的封装类的包，通过这些封装类去完成前后端数据转换对接，同时对于Mybatis的配置文件的半自动编写sql文件
有了更深的体会，也对前端框架layui有了一定的了解

以下是我自己对项目微服务调用的理解
![image](https://user-images.githubusercontent.com/72901123/126285538-073fbd0d-7cc2-4ab0-96b6-20a004bd69a0.png)

配置中心即Config把account、menu、order、client、user这几个微服务的配置文件统一管理，account、menu、order、client、user这些微服务向eureka server进行注册,
client客户端调用account、menu、order、user这几个微服务。


功能描述：
1.用户进入系统,显示系统所有菜品，用户可以订购菜品和查看个人订单信息
2.后台管理系统包括菜品管理、用户管理、订单管理三大模块，管理菜品信息,订单信息，用户信息。

技术描述：
1.整个项目使用Spring Cloud + Eureka +Mybatis +Spring Cloud Config+ Feign 实现；
2.前端页面使用Thymeleaf+layui框架实现

截图
eureka
![image](https://user-images.githubusercontent.com/72901123/126287275-be72815d-c885-4fe3-ae0a-edf38621ddba.png)
用户
![image](https://user-images.githubusercontent.com/72901123/126287304-76bf4422-5bff-4f95-8323-ee96a74e4f5b.png)
![image](https://user-images.githubusercontent.com/72901123/126287334-259380ae-b85f-44ef-bcf3-5c19d03a23a0.png)
后台
![image](https://user-images.githubusercontent.com/72901123/126287377-e27ec902-a6bc-46f1-a2b7-d8ae2f297b42.png)
![image](https://user-images.githubusercontent.com/72901123/126287406-382d9bcf-de13-420c-8e14-b0fd1bca37a7.png)
![image](https://user-images.githubusercontent.com/72901123/126287478-c87f4577-3a8b-4d84-8f7c-6cdb4447ad7f.png)
![image](https://user-images.githubusercontent.com/72901123/126287480-892341b4-9310-48b2-9c78-b5e1af0ff805.png)

