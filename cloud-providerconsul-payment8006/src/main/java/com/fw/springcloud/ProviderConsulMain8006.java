package com.fw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName
 * @Description TODO
 * @Author li
 * @Date 2020/3/14 8:53
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class ProviderConsulMain8006 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulMain8006.class, args);
    }
}
