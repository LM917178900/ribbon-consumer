package com.example.lei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: leimin
 * @Description: new class
 * @Date: 2020/6/8 16:04
 * @Version: 1.0
 */
@RestController
public class ConsumerController {

    /**
     * xx
     */
    @Autowired
    RestTemplate restTemplate;

    /**
     * yyy
     * @return rr
     */
    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    private String helloConsumer(){

        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}
