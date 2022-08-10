
import java.util.*;
public class UnitMatrix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int [row][col];

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){
 
                arr[i][j] = sc.nextInt(); 

            }
        }
         first:
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){
 
               
                if(i == j){

                    System.out.println(true);
                    continue first;
                    
                }else{

                    System.out.println(false);
                    continue first;
                }

            }

            return;
        }

       sc.close();


    }
    
}
