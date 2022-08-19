package AssignmentPassingValue;

public class Test {
    private  int i, j;

    public  void setNumber(int x, int y){

        i = x;
        j = y;

    }

    public void swap(Test p , Test q){

     int temp;
     temp = p.i;
     p.i = q.i;
     q.i = temp;

     temp = p.j;
     p.j = q.j;
     q.j = temp;

    }

    public void show(){

        System.out.println(" i " + i + " j " + j);


    }

}
