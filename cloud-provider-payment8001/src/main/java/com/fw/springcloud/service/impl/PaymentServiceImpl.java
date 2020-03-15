package com.fw.springcloud.service.impl;

import com.fw.springcloud.dao.PaymentDao;
import com.fw.springcloud.entities.Payment;
import com.fw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName
 * @Description TODO
 * @Author li
 * @Date 2020/3/13 15:10
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
