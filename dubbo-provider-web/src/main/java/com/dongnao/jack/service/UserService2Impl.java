package com.dongnao.jack.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.2", group = "user2")
public class UserService2Impl implements UserService {
    
    private static Logger logger = Logger.getLogger(UserService2Impl.class);
    
    public String login(String param) {
        logger.info("UserServiceImpl.login  begin!22222");
        return "用户已经登录成功！·~~~~~~~~~~~~~~~~~~";
    }
    
    public String login(int a, int b, String c) {
        logger.info("UserServiceImpl.login int a,Long b,String c2222222");
        return "我是重载的login方法";
    }
    
    public String[] mergeArray() {
        // TODO Auto-generated method stub
        return new String[] {"A", "B", "C", "E", "F", "J"};
    }
    
    public List<String> mergeList() {
        List<String> list = new ArrayList<String>();
        list.add("jack1");
        list.add("jhon1");
        list.add("laoxi1");
        return list;
    }
    
    public Map<String, String> mergeMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("user1", "lison");
        map.put("user2", "tony");
        return map;
    }
    
}
