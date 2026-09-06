package com.Arrays;
public class ArraysDemo2 {
	public static void main(String[] args) {
		String[] str= {"Akash", "Vishnu", "Sahithya", "Rakesh", "Teju"};
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		for (String s : str) {
			System.out.print(s+" ");
		}
	}
}
