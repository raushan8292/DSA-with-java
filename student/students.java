package student;

import java.util.*;

//class students{
//
//         private int roll;
//         private String name;
//         private double result;
//
//         public void setData(){
//             Scanner sc  = new Scanner(System.in);
//
//             System.out.println("Enter data ");
//
//             roll  = sc.nextInt();
//             name = sc.next();
//
//             result = sc.nextInt();
//         }
//         public void getData(){
//
//             System.out.println("your rool "+ roll+ " your name " + name + " your result " + result)  ;
//
//         }
//
//
//}
// privous mai draw back hai for code mai typography mai


class students{
    private int roll;
    private String name;
    private double result;
    public void setData(int r, String n, double res) {

        roll = r;
        name = n;
        result = res;


    }

    public  void getData(){

        System.out.println("your roll "+ roll+ " your name " + name + " your result " + result)  ;
    }
}