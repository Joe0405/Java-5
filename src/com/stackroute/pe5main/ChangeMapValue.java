package com.stackroute.pe5main;

import java.util.HashMap;
import java.util.Map;

public class ChangeMapValue {

	public Map<String, String> changeMapValue(Map<String, String> map) {
		Map<String, String> mapValue =  new HashMap<String, String>(map);
		mapValue.replace("val1", mapValue.get("val2"));
		mapValue.replace("val2", "");
		return mapValue;
		
	}

}
