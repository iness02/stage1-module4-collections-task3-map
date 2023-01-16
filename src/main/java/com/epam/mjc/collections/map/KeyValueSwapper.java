package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> swap=new HashMap<>();
        for(Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if(swap.containsKey(entry.getValue())){
                if(swap.get(entry.getValue())>entry.getKey()){
                    swap.put(entry.getValue(), entry.getKey());
                }
            }else{
                swap.put(entry.getValue(), entry.getKey());
            }
        }

        return swap;
    }
}
