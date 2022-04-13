// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to add the two numbes and print their value in base b.
// Input Format
// A base b
// A number n1
// A number n2
// Output Format
// A number representing the sum of n1 and n2 in base b.


import java.util.*;
public class Main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int  b = sc.nextInt();
     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     
     int an = getValue(b, n1, n2);
     System.out.println(an);
    }
    public static int getValue(int b , int n1, int n2){
        
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n1>0||n2>0||c>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;
            
            int d = d1 +d2+c;
            c = d/b;
            d = d%b;
            rv += d*p;
            p = p*10;
            
             
        }
        return rv;
    }

}
