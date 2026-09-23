package Excercises;

import java.util.Scanner;

public class Biggest {
    private int[] arr;

    public Biggest(int n) {
        this.arr = new int[n];
    }

    public void display(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in array is: " + max);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        Biggest myObj = new Biggest(n);
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            myObj.arr[i] = sc.nextInt();
        }
        myObj.display(myObj.arr);
        sc.close();
    }    
}
