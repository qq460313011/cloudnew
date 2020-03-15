package com.fw.myrule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName
 * @Description TODO
 * @Author li
 * @Date 2020/3/14 10:06
 **/
@Configuration
public class MySelfRule {

    @Bean
    public RandomRule getMySelfRule()
    {
        return new RandomRule();
    }

}
