package inheritance;

public class Manger extends Emp {

    private  double bouns;

    public void setBouns(double bouns){

        this.bouns = bouns;
    }

    public double getincome(){

         double amt = super.getSal() + bouns;
         return amt;
    }
}
