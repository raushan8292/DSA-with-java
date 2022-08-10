import java.util.*;

class Arrays2D{

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Your row col");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][]  arr = new int[row][col];

        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[i].length; j++){
                System.out.print("Enter your Number:");
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;


          
        // for (int i = 0; i < arr.length; i++){

        //     for (int j = 0; j < arr[i].length; j++){

        //         System.out.print(arr[i][j] + " ");
        //         sum += arr[i][j];

        //     }

        //     System.out.println();
        // }

        // We can also write the program useing Enhanced for loop

        for( int [] x : arr){

            for(int y: x){


                System.out.print(y + " ");
                sum += y;
            

            }

            System.out.println();
        }

        System.out.println("your Sum is " + sum);
        System.out.println("Avg. is " + (float)sum/(row*col));


        sc.close();

        
    }


}