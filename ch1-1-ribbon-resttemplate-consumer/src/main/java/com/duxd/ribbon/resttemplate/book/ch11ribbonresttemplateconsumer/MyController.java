package com.duxd.ribbon.resttemplate.book.ch11ribbonresttemplateconsumer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController implements ApplicationContextAware {

    @Autowired
    private RestTemplate restTemplate;

    private ApplicationContext applicationContext;

    @GetMapping("ribbon/test")
    public String ribbon(@RequestParam("name") String name){
        SpringClientFactory springClientFactory = applicationContext.getBean(SpringClientFactory.class);
        return restTemplate.getForObject("http://ribbon-provider-1/hello?name=" + name, String.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
