package com.dongnao.jack.mock;

public class MockServiceImpl implements MockService {
    
    public String mock(String param) {
        System.out.println("provider MockServiceImpl mock");
        return "provider MockServiceImpl mock";
    }
    
}
