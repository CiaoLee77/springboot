package com.lee.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // @Value("${name}")
    // private String name ;
    //
    // @Value("${url}")
    // private String url;

    @Autowired
    private Auth auth;


    @RequestMapping("/hello")
    public String hello(){
        return "Hello spring boot..."+ auth.getName()+" : is "+auth.getUsl();
    }
}
