package com.loops;

public class Example1 {

    public boolean isUglyNumber(int num) {

        if (num <= 0) {
            return false;
        }

        int temp = num;

        while (temp % 2 == 0) {
            temp = temp / 2;
        }

        while (temp % 3 == 0) {
            temp = temp / 3;
        }

        while (temp % 5 == 0) {
            temp = temp / 5;
        }

        return temp == 1;
    }

    public static void main(String[] args) {

        Example1 obj = new Example1();

        int num = 6;

        System.out.println("Enter the number: " + num);
        System.out.println(obj.isUglyNumber(num)
                ? "Is Ugly Number"
                : "Is Not Ugly Number");
    }
}