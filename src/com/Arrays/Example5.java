package com.Arrays;

public class Example5 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[2];

        for (boolean bool : arr) {
            arr[0] = true;
            arr[1] = false;
        
            System.out.println(bool);
        }
    }
}

