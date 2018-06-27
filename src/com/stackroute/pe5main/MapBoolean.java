package com.stackroute.pe5main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBoolean {
	public Map<String, Boolean> mapBoolean(String[] array) {
		List<String> arrayList = new ArrayList<>(); 
		Collections.addAll(arrayList, array);
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String temp : arrayList) {
            Integer freq = m.get(temp);
            m.put(temp, (freq == null) ? 1 : freq + 1);
        }
		Map<String,Boolean> map = new HashMap<String, Boolean>();
		for (Map.Entry<String, Integer> entry : m.entrySet())
		{
		    if(entry.getValue()>=2) {
	            map.put(entry.getKey(), true);
		    }
		    else
		    	map.put(entry.getKey(), false);
		}
		return map;
	}

}
