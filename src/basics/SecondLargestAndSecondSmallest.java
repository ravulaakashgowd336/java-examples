package basics;

import java.util.Arrays;
public class SecondLargestAndSecondSmallest {

	public static void main(String[] args) {
		int[] arr = {10, 28,35, 45,60};
		Arrays.sort(arr);
		int secondSmallest = arr[1];
		int secondLargest = arr[arr.length - 2];
		int sum = secondSmallest + secondLargest;
		System.out.println("Second Smallest: " + secondSmallest);
		System.out.println("Second Largest: " + secondLargest);
		System.out.println("Sum: " + sum);

	}

}
