package com.algorithm.greedy;

public class Main {
    public static void main(String[] args) {
        int N = 1260;
        int count = 0;

        int[] coinType = {500, 100, 50, 10};

        for(int i = 0; i<coinType.length;i++){
            count += N / coinType[i];
            N %= coinType[i];
        }

        System.out.println(count);
    }
}
