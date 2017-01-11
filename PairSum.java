package com.projects.sample.testProjects;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * only one pair for solution
 *
 *
 */
public class PairSum {
	private static int[] testArray = new int[] { 2,3,8,5,6,10};
	private static int total = 10;
	
	public static void main(String[ ] args) {
		if(testArray == null) {
			System.out.print("No values in array");
		}
		
		int[] result = new int[2];
		Map<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
		int index = 0;
		
		for (int number : testArray) {
			index++;
			int secondNumber = total - number;
			if (targetMap.containsKey(secondNumber)) {
				result [0] = targetMap.get(secondNumber).intValue();
				result [1] = index;
			}
			targetMap.put(number, index) ;
		}
		
		if(result != null) {
			for (int printIndex : result) {
				System.out.println(printIndex);
			}
		}
	}

}