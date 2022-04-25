package com.example;

public class Challenge2 {
    static int findSum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++)
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;

        return sum;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(findSum(num));
    }
}
