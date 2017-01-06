package com.projects.sample.testProjects;

import java.util.ArrayList;

public class ListChecker {
	
	private static ArrayList<Integer> listOfValues = getListOfValues();
	
	private static ArrayList<Integer> getListOfValues() {
		ArrayList<Integer> sampleListOfValues = new ArrayList<Integer>();
		sampleListOfValues.add(12);
		sampleListOfValues.add(3);
		sampleListOfValues.add(4);
		sampleListOfValues.add(5);
		sampleListOfValues.add(6);
		return sampleListOfValues;
	}
	
	public static void main(String[] args) {
		checkIfContainsAndPrintResult(12);
		checkIfContainsAndPrintResult(3);
		checkIfContainsAndPrintResult(7);
	}

	private static void checkIfContainsAndPrintResult(int value) {
		boolean containsDuplicate = listOfValues.contains(value);
		
		if(containsDuplicate) {
			System.out.println("List contains the value " + value);
		} else {
			System.out.println("List doesn't contain the value " + value);
		}
	}
	
}
