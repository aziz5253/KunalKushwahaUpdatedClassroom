package com.kunal;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int previous = 0;
        int next = 1;
        int count = 2;
        while(count <= n)
        {
            int temp = next;
            next = next + previous;
            previous = temp;
            count++;
        }
        System.out.println(next);
    }
}
