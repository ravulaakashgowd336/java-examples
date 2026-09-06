package com.Arrays;
import java.util.Scanner;

class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Non-prime numbers: ");

        for (int i = 0; i < n; i++) {
            boolean prime = true;

            if (a[i] < 2) {
                prime = false;
            } else {
                for (int j = 2; j * j <= a[i]; j++) {
                    if (a[i] % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (!prime) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}