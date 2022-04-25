package com.example;

import java.util.Scanner;

public class Challenge {
    public static boolean MathChallenge(int num) {

        if (num == 0) {
            return false;
        }

        double v = Math.log(num) / Math.log(2);
        return (Math.ceil(v) == (Math.floor(v)));

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(Integer.parseInt(s.nextLine())));
    }
}
