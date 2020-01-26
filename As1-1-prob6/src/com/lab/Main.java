package com.lab;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String pass = input.next();
        Password chk = new Password(pass);
    }
}
