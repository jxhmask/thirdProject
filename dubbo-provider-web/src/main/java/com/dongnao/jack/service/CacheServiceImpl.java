package com.dongnao.jack.service;

import java.util.concurrent.atomic.AtomicInteger;

public class CacheServiceImpl implements CacheService {
    
    private final AtomicInteger i = new AtomicInteger();
    
    public String findCache(String id) {
        System.out.println("request: " + id + ", response: "
                + i.getAndIncrement());
        return "request: " + id + ", response: " + i.getAndIncrement();
    }
}
