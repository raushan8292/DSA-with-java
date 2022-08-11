import java.util.*;
public class Ass_J_Arr {
    public static void main(String[] args) {
        
// Q.1 WAP to calculate average sales made by every salesman of the company. The number of salesmen as well as number of sales and sale values must be taken from the user
        
// How many salesmen ?
// 3

// How many sales for salesman 1?
// 2
// Enter sale value: 80
// Enter sale value: 12

// How many sales for salesman 2?
// 5
// Enter sale value : 30
// Enter sale value: 10
// Enter sale value: 40
// Enter sale value: 25
// Enter sale value: 36

// How many sales for salesman 3 ?
// 6
// Enter sale value:45
// Enter sale value: 70 
 //Enter sale value: 10
// Enter sale value : 50
// Enter sale value: 10
// Enter sale value : 45

//output
// Average sale of salesman 1:.......
// Average sale of salesman 2:........
// Average sale of salesman 3.....


// Q2. find out the best seller


         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your Row Size");
         int row = sc.nextInt();

         int [][] arr = new int[row][];
         int col;

         for(int i = 0; i < arr.length; i++){
            System.out.println("Enter your size for row" + (i+1) );

           col = sc.nextInt();
           arr[i] = new int[col];

           for(int j = 0; j < arr[i].length; j++){
                  
                 System.out.print("Enter your data for row " + (i+1) + " col " + (j+1) +": " );
                  arr[i][j] = sc.nextInt();
           }

         }

          int [] avg = new int [arr.length];   
          int max = 0;

         for(int i = 0; i < arr.length; i++){
          

            

           for(int j = 0; j < arr[i].length; j++){
                  
                avg[i] += arr[i][j];
           }
             

           //System.out.print("Average sale of salesman " + (i+1) +" : " + (float)avg[i]/(i*j) );


           if(avg[i]> max){

            max = avg[i];

           }



         }

       int i = 0;
       while(avg[i] != max){
        max = i;
        i++;
       }

       System.out.print("Best seller is " + max);
       System.out.println();


    }
    
}
