package com.fw.springcloud.service;

import com.fw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName
 * @Description TODO
 * @Author li
 * @Date 2020/3/13 15:10
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
