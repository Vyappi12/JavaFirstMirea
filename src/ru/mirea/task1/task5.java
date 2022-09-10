package ru.mirea.task1;

public class task5 {
    public static int fact(int n) {
        if (n == 0) return  1;
        else {
            int c = 1;
            for (int i = 1; i <= n; i++) c *= i;
            return c;
        }
    }

    public static void main(String []args){
        System.out.println(fact(2));
        System.out.println(fact(3));
        System.out.println(fact(4));
    }
}
