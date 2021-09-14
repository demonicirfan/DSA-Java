package com.company;

import java.util.Scanner;

public class febo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + p;
            p = temp;
            count++;
            System.out.println(b);
        }
    }
}
