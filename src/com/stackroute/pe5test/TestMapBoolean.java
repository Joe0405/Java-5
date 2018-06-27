package com.stackroute.pe5test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe5main.MapBoolean;

public class TestMapBoolean {
	MapBoolean mapBoolean;

	@Before
	public void setUp() throws Exception {
		mapBoolean = new MapBoolean();
	}

	@After
	public void tearDown() throws Exception {
		mapBoolean = null;
	}

	@Test
	public void test() {
		String[] array = {"a","b","c","d","a","c","c"} ;
		Map<String, Boolean> expected = new HashMap<String, Boolean>();
		expected.put("a", true);
		expected.put("b", false);
		expected.put("c", true);
		expected.put("d", false);
		Map<String, Boolean> actual = mapBoolean.mapBoolean(array);
		assertEquals(expected, actual);
	}

}
