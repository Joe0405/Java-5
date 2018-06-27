package com.stackroute.pe5main;

import java.util.ArrayList;

public class UpdateElement {
	public ArrayList<String> updateElement(ArrayList<String> list, int[] index, String[] element) {
	    ArrayList<String> updateElement = new ArrayList<String>(list);
	    int i=0;
	    for(String temp : element) {
	    	 updateElement.set(index[i], temp);
	    	 i++;
	    }
		return updateElement;
	   
	}
	 public ArrayList<String> deleteList(ArrayList<String> list) {
		 list.clear();
		 return list;	 
	 }

}
