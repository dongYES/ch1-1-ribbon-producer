package com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RibbonClient(value = "ribbon-provider-1", configuration = {MyRibbonConfig.MyConfig1.class})
public class MyRibbonConfig {

    @Configuration
    static class MyConfig1{
        @Bean
        public IRule iRule(){
            return new RandomRule();
        }
    }
}
