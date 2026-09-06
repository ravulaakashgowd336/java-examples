package com.Arrays;
public class ArraysDemo3 {
	public static void main(String[] args) {
		int[] marks = {23, 47, 76, 34, 65, 85};
		int sum = 0;
		int avg = 0;
		for(int m:marks) {
			sum = sum+m;
		}
		avg=sum/marks.length;
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
	}
}
