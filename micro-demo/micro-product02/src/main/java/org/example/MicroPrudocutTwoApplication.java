package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @date: 2020/10/10
 * @description: 2020/10/10
 **/
@SpringBootApplication
@EnableEurekaServer
public class MicroPrudocutTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroPrudocutTwoApplication.class,args);
    }
}
