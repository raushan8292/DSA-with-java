package student;

import java.util.Scanner;
//
//public class UseStudent {
//
//    public static void main(String[] args) {
//
//        students s = new students();
//
//        s.setData();
//        s.getData();
//
//        students p = new students();
//        p.setData();
//        p.getData();
//
//
//    }
//
//}

// privous mai draw back hai for code mai typography mai

class UseStudent{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        students s1 = new students();

        System.out.println("Enter Your inputs 1: ");

        int  roll = sc.nextInt();
        String name = sc.next();
        double result = sc.nextDouble();

        s1.setData(roll , name, result);
        s1.getData();

        students s2 = new students();
        System.out.println("Enter Your inputs 2 : ");

       roll = sc.nextInt();
       name = sc.next();
         result = sc.nextDouble();

        s2.setData(roll , name, result);
        s2.getData();
    }
}

