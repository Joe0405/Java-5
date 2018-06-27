package com.stackroute.pe5test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe5main.SetSort;

public class TestSetSort {
	SetSort setSort;

	@Before
	public void setUp() throws Exception {
		setSort = new SetSort();
	}

	@After
	public void tearDown() throws Exception {
		setSort = null;
	}

	@Test
	public void test() {
		String[] toSort = {"Harry",  "Olive", "Alice",  "Bluto",  "Eugene"};
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Alice");
		expected.add("Bluto");
		expected.add("Eugene");
		expected.add("Harry");
		expected.add("Olive");
		ArrayList<String> actual = setSort.setSort(toSort);
		assertEquals(expected,actual);
		
	}

}
