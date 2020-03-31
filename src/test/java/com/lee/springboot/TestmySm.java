package com.lee.springboot;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestmySm {
    @Test
    void contextLoads() {
        HashMap<String, String> map = new HashMap<>();

        map.put("111","aaa");
        map.put("222","bbb");
        map.put("333","ccc");

        boolean bbb = map.containsValue("bbb");
        System.out.println(bbb);
        System.out.println(map);

    }
}
