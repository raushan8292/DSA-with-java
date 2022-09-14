package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//  1st  program 10 / 0 k liya;
class DivideAndSum{

   public  DivideAndSum (int a, int b){
       try {
           int c = a/b;
           System.out.println("Divied is " + c);
       } catch (ArithmeticException ex){
          // System.out.println(ex.getMessage());
           ex.printStackTrace();
      System.out.println("Please Input non Zero denomenator");
       }
       int d = a + b;
       System.out.println("SUM is " + d);
}
}

//  2nd  program 10 / 0 k liya;
class  Assigenment{

    public  Assigenment(int a, int b){

        try {
            int c = a/b;
            System.out.println("The Division " + c);

        } catch (ArithmeticException ex){
            System.out.println("Denomenator must be non zero");

        }

        int sum = a+b;
        System.out.println("Sum is " + sum);
    }
}
//  3rd  program 10 / 0 k liya;
class ToString{
    private  int age;
    private  String Name;
   public ToString(int age , String Name){
        this.age = age;
        this. Name = Name;
    }

    public String toString(){
       return Name + "," + age;
    }


}


public class Exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 2 digit ");
        int a = 0,b=0;
        //String  str ="";

        try {
             a = sc.nextInt();
             b = sc.nextInt();
            // str = sc.next();

        }catch (InputMismatchException e) {
           // e.printStackTrace();
           System.out.println("Please enter integer only ");
        }


       //DivideAndSum d1 = new DivideAndSum(a,b);

       // Assigenment a1  = new Assigenment(a,b);

//          ToString t1 = new ToString(a,str);
//        System.out.println(t1);
//        or you can say that t1.toString go from the sout with refrence



    }
}
