package RotateArrays;

import java.util.Scanner;

public class RotateArray {

    public   void  display(int[] arr){

        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    private void  swap(int [] arr, int i , int j){

       while (i < j){

           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;

           i++;
           j--;
       }
    }

      private    void  rotate(int[] arr, int k){
         RotateArray b = new RotateArray();
        k = k % arr.length;
        if(k < 0){
            k = (k + arr.length);
        }

          b.swap(arr, 0 , arr.length-k-1);

         b.swap(arr, arr.length-k, arr.length-1);

         b.swap(arr, 0, arr.length-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arr size");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i=0; i < n; i++){

            System.out.println("Enter your arr" + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter yur rotate digit");
        int  k = sc.nextInt();

        RotateArray r = new RotateArray();

        r.rotate(arr, k);
        r.display(arr);
    }


}
