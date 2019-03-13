package com.dongnao.jack.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class ProviderServiceImpl implements ProviderService {
    private static Logger logger = Logger.getLogger(ProviderServiceImpl.class);
    
    public String[] mergeArray() {
        // TODO Auto-generated method stub
        return new String[] {"A", "B", "C", "G"};
    }
    
    public List<String> mergeList() {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        list.add("jack");
        list.add("jhon");
        list.add("laoxi");
        return list;
    }
    
    public Map<String, String> mergeMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("user1", "lison1");
        map.put("user2", "tony1");
        return map;
    }
    
}
