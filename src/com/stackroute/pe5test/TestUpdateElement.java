package com.stackroute.pe5test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe5main.UpdateElement;

public class TestUpdateElement {
	UpdateElement updateElement;

	@Before
	public void setUp() throws Exception {
		updateElement = new UpdateElement();
	}

	@After
	public void tearDown() throws Exception {
		updateElement = null;
	}

	@Test
	public void testUpdate() {
		ArrayList<String> elements = new ArrayList<>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("Kiwi", "Grape", "Mango", "Berry"));
		String[] replace = {"Kiwi","Mango"};
		int[] index = {0,2};
		ArrayList<String> actual = updateElement.updateElement(elements, index, replace);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testDelete() {
		ArrayList<String> elements = new ArrayList<>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
		ArrayList<String> expected = new ArrayList<>();
		ArrayList<String> actual = updateElement.deleteList(elements);
		assertEquals(expected,actual);
	}

}
