package com.duxd.ribbon.resttemplate.test.ch11ribbonproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ch11RibbonProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch11RibbonProducerApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam("name")String name){
        return "hello" + name;
    }

}

