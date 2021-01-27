# SpringBootDemo
> SpringBoot练手项目
### Spring启动方式
```java
@SpringBootApplication
class App{
    //启动方法
    public static void main(String[] args){
        SpringApplication.run(App.class);
    }
}
```
***
###常用注解
>  @SpringBootApplication 
- 在类中加上该注解，表明该类是SpringBoot主类通过main方法启动SpringBoot
> @SpringBootConfiguration
- 表示这是一个SpringBoot的配置类
> @Configuration
- 配置类与配置文件类似,配置类也是一个Component
>  @EnableAutoConfiguration 
- 开启自动配置，SpringBoot自动配置，这个注解使用的是@AutoConfiguration注解，@AutoConfiguration又使用了Spring底层的@Import注解，为当前类导入配置类
>  @ComponentScan("")  
- 加入包路径，即可扫描指定路径下的所有接口
---
>  @RestController
- 该注解中已经加入了@Controller和@ResponseBody
>  @RequestMapping("/log") 
- 定义接口的路径（可以在类上和方法上使用）


