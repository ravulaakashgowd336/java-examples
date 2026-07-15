package com.loops;

public class Example3 {

    public boolean isHarshadNumber(int num) {

        if (num <= 0) {
            return false;
        }

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return num % sum == 0;
    }

    public static void main(String[] args) {

        Example3 obj = new Example3();

        int num = 18;

        System.out.println("Number: " + num);
        System.out.println(obj.isHarshadNumber(num)
                ? "Harshad Number"
                : "Not a Harshad Number");
    }
}
   