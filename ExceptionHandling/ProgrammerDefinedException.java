package ExceptionHandling;
import com.sun.jdi.InvalidLineNumberException;

import java.util.*;


class IndvalidNumeratorException extends  ArithmeticException{
    public IndvalidNumeratorException(String msg){
        super(msg);
    }
}

public class ProgrammerDefinedException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ");

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
         if(a <= 0){
             throw new IndvalidNumeratorException ("Nmmber should be positive");
         }
         int c = a/b;
            System.out.println("Your Divison is" + c);
        }catch (ArithmeticException ex ){

            ex.printStackTrace();
            System.out.println("Enter positive integer");
        }catch (InvalidLineNumberException ex){

            System.out.println(ex.getMessage());

        }catch (InputMismatchException ex){
            System.out.println("please input digit only");
        }

    }
}
