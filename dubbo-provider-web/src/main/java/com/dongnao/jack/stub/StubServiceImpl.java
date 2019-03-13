package com.dongnao.jack.stub;

public class StubServiceImpl implements StubService {
    
    public String stub(String param) {
        System.out.println("provider StubServiceImpl stub");
        return "provider StubServiceImpl stub";
    }
    
}
