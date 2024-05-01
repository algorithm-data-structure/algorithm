package com.algorithm.greedy.큰_수의_법칙;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 배열 N, 더하는 횟수 M, 연속 가능 횟수 K 입력
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        //2. 배열 n 생성
        int[] array = new int[n];

        //3.배열 n에 해당 값을 입력받기
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        //4.정렬
        Arrays.sort(array);

        //5. 가장 큰 수
        int first = array[n - 1];
        int second = array[n - 2];

        //6.가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; //가장 큰 수 더하기
        result += (m - cnt) * second; //두번째로 큰 수 더하기

        System.out.println(result);
    }
}
