package inheritance.Assignment;

public class Cylinder extends  Circle {

    private int height;

    public  Cylinder(int radius , int height){

        super(radius);

        this.height = height;
    }
    public double area(){

       double Cyarea = 2 * super.area() * 2 * Math.PI * radius;

       return Cyarea;
    }

    public  double volume(){
         double Cvolume = super.area() * height ;

         return Cvolume;
    }

}

