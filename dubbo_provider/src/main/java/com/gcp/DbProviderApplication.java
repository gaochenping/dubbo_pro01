package com.gcp;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动的每个Dubbo应用，一定会在注册中心中注册信息。
 *  * 服务提供者注册的是/dubbo/xxx/providers
 *  * 服务消费者注册的是/dubbo/xxx/consumers
 *  *
 *  * Dubbo启动器（dubbo-spring-boot-starter）默认不生效。
 *  * 必须通过@EnableDubbo让启动器生效。
 *  *
 *  * 在2.7.2- 版本中，部分配置默认不加载，需要使用@EnableDubboConfig让
 *  * 全部配置生效。
 *  *
 *  *
 *  * 负载均衡策略：
 *  *  设置负载均衡策略，可以在@DubboService或者@DubboReference注解上
 *  *  加属性loadbalance进行配置。
 *  *  消费者默认是不考虑负载均衡策略的，是使用提供者定义的负载均衡策略。
 *  *  如果消费者配置了负载均衡策略，则忽略提供者配置的负载均衡策略。
 */
@SpringBootApplication
@EnableDubbo
public class DbProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbProviderApplication.class,args);
    }
}
