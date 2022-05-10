package com.bridgelabz.Day_16;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main (String[] args) {
		String[] arr = {"Good","Bad","Best","Worst"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to search : ");
		String input = scan.nextLine();
		int result = Arrays.binarySearch(arr,input);
		if(result<0)
			System.out.println("Word is not found");
		else
			System.out.println("Word is found at index : "+result);
	}
}
