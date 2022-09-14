package inheritance.Assignment;

public class Circle {


    public int radius;
     public Circle(int radius){

         this.radius = radius;
     }

     public int getRadius(){

         return  this.radius;
     }

     public  double area(){

        double Carea = Math.PI * (this.radius * this.radius) ;

        return Carea;
     }
}
