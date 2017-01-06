package com.projects.sample.testProjects;

import java.util.Scanner;

/**
 * Program for printing String value
 *
 */
public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Welcome 2017 !!!");
		System.out.print("Please provide fist String");
		String testString = new Scanner(System.in).next();
		System.out.printf(testString);
	}

}
