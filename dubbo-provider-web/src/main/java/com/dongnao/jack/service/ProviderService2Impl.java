package com.dongnao.jack.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class ProviderService2Impl implements ProviderService {
    private static Logger logger = Logger.getLogger(ProviderService2Impl.class);
    
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
