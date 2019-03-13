package com.dongnao.jack.service;


public class AsyncServiceImpl implements AsyncService {
    
    public String sayHello(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("async provider received: " + name);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return "hello, " + name;
    }
    
}