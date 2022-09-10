package ru.mirea.task1;

public class task1 {
    public static void main(String []args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int i = 0, c = 0;
        while (i != arr.length) {
            c += arr[i];
            i++;
        }
        System.out.println(c);
        c = 0;
        for (i = 0; i!=arr.length; i++){
            c+=arr[i];
        }
        System.out.println(c);
        i = 0;
        c = 0;
        do{
            c+=arr[i];
            i++;
        } while (i!=arr.length);
        System.out.println(c);
    }
}
