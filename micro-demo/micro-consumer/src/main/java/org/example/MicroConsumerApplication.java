package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @date: 2020/10/10
 * @description: 2020/10/10
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"org.example.service"})
public class MicroConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroConsumerApplication.class,args);
    }
}
