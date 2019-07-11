package org.liukun.spring.cloud.test.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("get")
    public String get(){
        return restTemplate.getForObject("http://service-hi/hi", String.class);
    }
}
