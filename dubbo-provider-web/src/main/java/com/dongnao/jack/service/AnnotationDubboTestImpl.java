package com.dongnao.jack.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout = 1000000, version = "1.2.3")
public class AnnotationDubboTestImpl implements AnnotationDubboTest {
    
    public String eat(String param) {
        System.out.println("-----------AnnotationDubboTestImpl service test------------"
                + param);
        return "-----------AnnotationDubboTestImpl service test------------";
    }
    
}
