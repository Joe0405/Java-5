package com.stackroute.pe5main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountString {
	public HashMap<String, Integer> countString(String s) {
		String[] makeArray = s.split("[^A-Za-z0-9]");
		List<String> arrayList = new ArrayList<>(); 
		Collections.addAll(arrayList, makeArray);
		arrayList.removeAll(Arrays.asList("",null));
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();

        for (String temp : arrayList) {
            Integer freq = m.get(temp);
            m.put(temp, (freq == null) ? 1 : freq + 1);
        }
        
        return m;
		
	}

}
