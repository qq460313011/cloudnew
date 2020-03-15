package com.fw.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName
 * @Description TODO
 * @Author li
 * @Date 2020/3/14 9:07
 **/
@RestController
@Slf4j
public class ConsumerConsulController {

    public static final String PAYMENT_URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String getPayment() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
    }

}
