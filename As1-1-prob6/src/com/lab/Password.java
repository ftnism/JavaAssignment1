package com.lab;

public class Password {
    String pass;
    Password(String pass) {
        this.pass = pass;

        int length, i, countAZ = 0, countaz = 0, count01 = 0;
        length = pass.length();
        if (length >= 6) {
            for (i = 0; i < length; i++) {
                char tst = pass.charAt(i);
                if (tst >= 'A' && tst <= 'Z') {
                    countAZ++;
                } else if (tst >= 'a' && tst <= 'z') {
                    countaz++;
                } else if (tst >= '0' && tst <= '9') {
                    count01++;
                }
            }
            if ((count01 + countaz + countAZ) == length) {
                System.out.println("Password Valid");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Password short");
        }
    }
}
