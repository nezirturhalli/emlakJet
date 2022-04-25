package com.example;

import java.util.*;

class Challenge1 {

    public static String SearchingChallenge(String str) {
        int count = 0, temp = 0;
        String[] wordList = str.split(" ");
        String word = wordList[0];

        for (int i = 0; i < wordList.length; i++) {
            for (int j = 0; j < wordList[i].length(); j++) {
                temp = 0;
                for (int k = 0; k < wordList[i].length(); k++) {
                    if (wordList[i].charAt(j) == wordList[i].charAt(k)) {
                        temp++;
                    }
                }
                if (count < temp) {
                    count = temp;
                    word = wordList[i];
                }
            }
        }
        if (count == 1) {
            return "-1";
        }
        str = word;
        return str;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }

}