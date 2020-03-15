package com.fw.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName
 * @Description TODO
 * @Author li
 * @Date 2020/3/14 8:59
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentconsul() {
        return "springcloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
