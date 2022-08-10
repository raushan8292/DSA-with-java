
import java.util.*;
class JaggedArrays{

		public static void main(String [] args){

          Scanner sc = new Scanner(System.in);

		System.out.print(" Hey! this jagged arryas :) Enter your row: "); 

             int row = sc.nextInt();

		
           int [][] arr = new int [row][];
		int col;

            for(int i = 0; i < arr.length; i++){

                 System.out.print("Enter your " + (i+1)   + " colum size: " );
                    col = sc.nextInt();

                   arr[i] = new int [col];
 
                    for(int j = 0; j < arr[i].length; j++){
                       
                       System.out.print("Enter your data for " + "row " + (i+1) + " col " + (j+1) + ": " );
                        arr[i][j] = sc.nextInt();
          }
              

         }

            for(int i = 0; i < arr.length; i++){

 
 
                    for(int j = 0; j < arr[i].length; j++){
                       
                       System.out.print(arr[i][j] + " ");
                       
             

                }
                  System.out.println();
           }


}
}