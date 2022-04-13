// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.
// Input Format
// A number n
// A base b1
// A base b2
// Output Format
// A number of base b2 equal in value to n of base b1.


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int value = anyBaseToAnyBase(n,b1,b2);
		System.out.println(value);
	
	}
	public static int anyBaseToAnyBase(int n, int b1, int b2){
	    int d1 = anyBaseTODecimal(n, b1);
	    int d2  = anyDecimalToBase(d1, b2);
	    return d2;
	}
	public static int anyBaseTODecimal(int n , int b) {
	    int rv = 0;
	   int p = 1;
	    while(n>0){
	        int digit = n%10;
	        n = n/10;
	        rv += digit*p;
	        p = p*b;
	    }
	    return rv;
	}
	public static int anyDecimalToBase(int n, int b){
	    int rv = 0;
	   int p = 1;
	    while(n>0) {
	        int digit = n%b;
	        n = n/b;
	        rv += digit*p;
	         p = p*10;
	    }
	    return rv;
	    
	}
	
	
}
