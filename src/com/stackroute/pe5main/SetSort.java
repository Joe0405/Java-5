package com.stackroute.pe5main;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetSort {
	public ArrayList<String> setSort(String[] toSort) {
		 SortedSet<String> sort = new TreeSet<>();
		 for(String temp: toSort) {
			 sort.add(temp);
		 }
		 ArrayList<String> sorted = new ArrayList<>();
		 sorted.addAll(sort);
		return sorted;
		
	}

}
