package com.att.hackerrank.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class HackerPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sequenceLiteral();
//		System.out.println(getSmallestAndLargest(
//				"ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH",
//				240));

//		reverseString();
		sytancChecker();
	}

	static void sequenceLiteral() {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());
		int comp = A.compareTo(B);

		if (comp > 0) {
			System.out.println("Yes");
		} else if (comp < 0 || comp == 0) {
			System.out.println("No");
		}

		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

	}

// SubString Comparions

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		ArrayList<String> newlist = new ArrayList<>();
		for (int i = 0; i <= s.length() - k; i++) {
			String sub = s.substring(i, i + k);
			newlist.add(sub);

//			if (smallest == null || smallest.compareTo(sub) > 0) {
//				smallest = sub;
//
//			}
//
//			if (largest == null || largest.compareTo(sub) < 0) {
//				largest = sub;
//			}

		}

		Collections.sort(newlist);

		int lastIndex = newlist.size() - 1;
		smallest = newlist.get(0);
		largest = newlist.get(lastIndex);
		return smallest + "\n" + largest;
	}

//function to reverse the string and compare
	public static void reverseString() {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next(), newString = "";
		char ch;
		try {
			for (int i = 0; i < input1.length(); i++) {
				ch = input1.charAt(i);
				newString = ch + newString;
			}

			if (newString.equals(input1)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} catch (Exception ex) {
			System.out.println(ex);

		}

	}

// Pattern Syantx checker
	static void sytancChecker() {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			try {
				Pattern p = Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
		testCases--;
	}

	static void xxx() {

	int [] a = new int[4];

	for (int i=0; i < a.length-1;i++)
    {
        System.out.println(a[i]);
    }
	}

	IntStream.range()
}
