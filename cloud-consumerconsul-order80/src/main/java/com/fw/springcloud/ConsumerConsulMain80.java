package com.fw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName
 * @Description TODO
 * @Author li
 * @Date 2020/3/14 9:05
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class ConsumerConsulMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulMain80.class,args);
    }

}
