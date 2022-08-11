
class car{

    
    int i;
    char a;
    double d;
}


class Usecar{
    
    public static void main(String[] args) {
        car c =  new car();

        c.i = 20;
        c.a = 'b';
        c.d = 55.5;
        System.out.println(c.i + c.a + c.d );
    }
}


/* DRAWBACK WITH THE PREVIOUS CODE



Although the previous code will compile and run without any errors, but it is voilating the PRINCIPLES OF OBJECT ORIENTED PROGRAMMING.

This is because acc ot OOP, all the data of a class SHOULD NEVER BE DIRECTLY ACCESSED/ACCESSIBLE from outside the class, for obvious security reason. And in our code we are doing that, so we say that the code is voilating the OOP principle.

The priciple which is getting voilated is the principle of ENCAPSUATION which says that all the data of a class MUST only be accessed from it's member functions(methods).

So to make our compliant with the principle of ENCAPSULATION, we must make three changes in the code:

1. Declare the data members of "Student" class as private

2. Define methods in the class for initializing and displaying the values of data members.

3. Finally, in the driver call these methods using the object of Student class. */






class Student{
  
    private int i;
    private char a;
    private double d;

    public void setData(){
        i = 10;
        a = 'A';
        d = 10.5;
    }

    public void getData(){
        System.out.println(i +"," + a + " ," + d);
    }
    
}



public class UseStuden {

    public static void main(String[] args) {
        Student s = new Student();
        s.setData();
        s.getData();

    }
    
}