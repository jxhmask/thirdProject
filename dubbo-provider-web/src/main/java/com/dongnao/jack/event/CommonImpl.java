package com.dongnao.jack.event;

public class CommonImpl implements Common {
    
    public String eat(String param) {
        
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("CommonImpl eat");
        return "CommonImpl eat";
    }
    
}
