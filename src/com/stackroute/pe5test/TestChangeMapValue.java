package com.stackroute.pe5test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe5main.ChangeMapValue;

public class TestChangeMapValue {
	ChangeMapValue changeMap;

	@Before
	public void setUp() throws Exception {
		changeMap = new ChangeMapValue();
	}

	@After
	public void tearDown() throws Exception {
		changeMap = null;
	}

	@Test
	public void test() {
		Map<String, String> mapValue =  new HashMap<String, String>();
		mapValue.put("val1", "java");
		mapValue.put("val2", "c++");
		Map<String, String> expected =  new HashMap<String, String>();
		expected.put("val1", "c++");
		expected.put("val2", "");
		Map<String, String> actual = changeMap.changeMapValue(mapValue);
		assertEquals(expected,actual);
	}

}
