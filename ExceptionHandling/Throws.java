package ExceptionHandling;

import java.io.*;

 class Input {
     public static void accept() throws IOException {

         System.out.println("Enter your character ");
         char c  = (char)System.in.read();
         System.out.println("Your Entered " + c);
     }
 }

class  Throws{
    public static void main(String[] args) throws IOException {

        Input.accept();
    }
}
