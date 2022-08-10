import java.util.*;


public class AssignmentTwoDArrays {
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

       System.out.println("Enter the student number");

      int student = sc.nextInt();

      System.out.println("Enter the students no of subject");

      int subject = sc.nextInt();


      int [][] arr = new int[student][subject];

      for(int i = 0; i < arr.length; i++){

        System.out.print("Enter Your Student marks " + (i+1) + "= ");

         
          for(int j = 0; j < arr[i].length; j++){

         

            arr[i][j] = sc.nextInt();

          }

          System.out.println();
  
      }   
      
        int [] sum = new int[arr.length];

           int max = 0;

          for(int i = 0; i < arr.length; i++){
          
            for(int a : arr[i] ){

                sum[i] += a;
            } 

            if(max < sum[i]){

              max = sum[i];
            }

    
          }

         
          int i = 0;

            while(max != sum[i]){
              i++;
             
            }

         System.out.println("Tooper is " + (i+1));

    }
}



