package com.dongnao.jack.service;

import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.dubbo.rpc.service.GenericService;

public class MyGenericService implements GenericService {
    
    public Object $invoke(String method, String[] parameterTypes, Object[] args)
            throws GenericException {
        System.out.println("泛化调用！");
        return "OK";
    }
    
}
