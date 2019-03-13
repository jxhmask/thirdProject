package com.dongnao.jack.service;

public class ValidationServiceImpl implements ValidationService {
    
    public void save(ValidationParameter parameter) {
        System.out.println("save");
    }
    
    public void update(ValidationParameter parameter) {
    }
    
    public void delete(long id, String operator) {
        System.out.println("delete");
    }
    
}
