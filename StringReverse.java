package com.projects.sample.testProjects;


/**
 * reverse the string
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		String originalString = "This is programm for string reverse";
		
		String reversString = "";
		if(originalString != null && !originalString.isEmpty()) {
			StringBuilder temp = new StringBuilder(originalString);
			reversString = temp.reverse().toString();
			System.out.println(reversString);
		}
	}
}
