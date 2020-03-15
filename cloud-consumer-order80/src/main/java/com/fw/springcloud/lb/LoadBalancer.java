package com.fw.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author li
 * @Date 2020/3/14 10:30
 **/
public interface LoadBalancer {


    ServiceInstance instances(List<ServiceInstance> serviceInstances);



}
