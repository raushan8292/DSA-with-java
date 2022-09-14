package ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter two Integer ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<= 0){
                // Here nmae and catch must be same for get your own error
                ArithmeticException ae = new ArithmeticException("Numerator should be positive");
                throw ae;
            }
            int c = a/b;
            System.out.println("The divison is" + c );
        }catch(ArithmeticException ex ){
            System.out.println(ex.getMessage());
        }
    }
}
