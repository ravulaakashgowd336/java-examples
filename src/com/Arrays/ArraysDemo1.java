package com.Arrays;
public class ArraysDemo1 {
	public static void main(String[] args) {
		int[] arr = {34, 54, 24, 67, 87, 75};
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
