package com.stackroute.pe5test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException;

import com.stackroute.pe5main.CountString;

public class TestCountString {
	CountString countString;

	@Before
	public void setUp() throws Exception {
		countString = new CountString();
	}

	@After
	public void tearDown() throws Exception {
		countString = null;
	}

	@Test
	public void test() {
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("one", 5);
		expected.put("two", 2);
		expected.put("three", 2);
		HashMap<String, Integer> actual = countString.countString("one one -one___two,,three,one @three*one?two");
		assertEquals(expected,actual);
	}
	

}
