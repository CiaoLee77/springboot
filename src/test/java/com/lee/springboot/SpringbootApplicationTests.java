package com.lee.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class SpringbootApplicationTests {

    @Test
    void contextLoads() {
        HashMap<String, String> map = new HashMap<>();

        map.put("111","aaa");
        map.put("222","bbb");
        map.put("333","ccc");

        System.out.println(map);

    }

}
