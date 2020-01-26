package com.lab;
import java.util.Scanner;

class chkArm{
    int dat,tmp,comp,sum=0;
    chkArm(int dat){
        this.dat=dat;
    }

    void ans(){
        comp = dat;
        while(dat>0){
            tmp = dat%10;
            sum = sum + (tmp*tmp*tmp);
            dat = dat/10;
        }
        if(sum == comp){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kbrdinp = input.nextInt();
        chkArm number1 = new chkArm(kbrdinp);
        number1.ans();
    }
}
