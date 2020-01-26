package com.lab;


public class Sorting {


    void assending(int[] dat){
        int len = dat.length;
        for (int i = 0; i < len; i++){
            for(int j = i+1; j< len; j++){
                if(dat[i]>dat[j]){
                    int tmp = dat[i];
                    dat[i] = dat[j];
                    dat[j] = tmp;
                }
            }
        }


    }

    void desending(int[] dat){
        int len = dat.length;
        for (int i = 0; i < len; i++){
            for(int j = i+1; j< len; j++){
                if(dat[i]<dat[j]){
                    int tmp = dat[i];
                    dat[i] = dat[j];
                    dat[j] = tmp;
                }
            }
        }


    }

    void print(int[] dat){
        System.out.println("");
        for(int i = 0; i<dat.length; i++){
            System.out.print(" "+dat[i]+", ");
        }

    }


}
