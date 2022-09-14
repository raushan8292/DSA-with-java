package inheritance;

public class l_36 {

    public  void show(int a ){

        System.out.println("In show of base class with int arg:" + a);
    }
    public  void show(String str ){

        System.out.println("In show of base class with int arg:" + str);
    }

}

 class  Derived extends  l_36{

    public void show( double b){
         System.out.println("In this shoe of derived class with int arg: " + b);
     }
     public void show( int a){
        super.show(a);

         System.out.println("In this shoe of derived class with int arg: " + a );
     }
}

 class  UseDerived{

    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.show(2.5 );
        obj.show("Raushan");
        obj.show(15);
        obj.show('A');
    }
}

