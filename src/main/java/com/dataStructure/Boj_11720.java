package com.dataStructure;

import java.util.Scanner;

public class Boj_11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String sNumber = sc.next();
        char[] cNumber = sNumber.toCharArray();

        for (int i = 0; i < cNumber.length; i++) {
            sum += cNumber[i] - '0';
        }

        System.out.print(sum);
    }
}
