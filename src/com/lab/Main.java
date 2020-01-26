package com.lab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers : ");
        int n = input.nextInt();
        int[] dat = new int[n];
        for(int i = 0; i<n; i++){
            dat[i] = input.nextInt();
        }

        Sorting sort = new Sorting();
        sort.assending(dat);
        sort.print(dat);
        sort.desending(dat);
        sort.print(dat);

    }
}
