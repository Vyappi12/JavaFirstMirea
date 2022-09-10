package ru.mirea.task1;

import java.util.*;

public class task4 {
    public static int getRandNum() {
        return (int) (Math.random() * 10);
    }

    public static void main(String []args){
        int[] arr = new int[10];
        for (int i = 0; i<10; i++){
            arr[i] = getRandNum();
            System.out.println(arr[i]);
        }
        int prom;
        int c = 0;
        while (c == 0){
            c = 1;
            for (int q = 0; q < arr.length-1; q++){
                if(arr[q] > arr[q+1]){
                    c = 0;
                    prom = arr[q];
                    arr[q] = arr[q+1];
                    arr[q+1] = prom;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[10];
        Random random = new Random();
        for (int i = 0; i<10; i++){
            arr1[i] = random.nextInt();
            System.out.println(arr1[i]);
        }
    }
}
