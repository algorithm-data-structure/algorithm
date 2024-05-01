package com.algorithm.greedy.숫자_카드_게임;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.행의 갯수 N,열의 갯수 M 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        //2. 한 줄씩 입력 받아 확인하기
        for(int i = 0; i<n;i++){
            //현재 줄에서 가장 작은 수 찾기
            int min_value = 10001;
            for(int j = 0; j<m;j++){
                int x = sc.nextInt();
                min_value = Math.min(min_value,x);
            }
            //가장 작은 수들 중에서 가장 큰 수 찾기
            result = Math.max(result,min_value);
        }
        System.out.println(result);
    }
}
