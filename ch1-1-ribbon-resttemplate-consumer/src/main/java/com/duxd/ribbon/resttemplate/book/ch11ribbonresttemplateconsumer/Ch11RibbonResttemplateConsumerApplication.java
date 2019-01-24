package com.duxd.ribbon.resttemplate.book.ch11ribbonresttemplateconsumer;

import com.config.MyRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ch11RibbonResttemplateConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch11RibbonResttemplateConsumerApplication.class, args);
    }

    @Bean
    public MyRibbonConfig myRibbonConfig(){
        return new MyRibbonConfig();
    }

}

