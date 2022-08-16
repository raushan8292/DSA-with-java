package ConstructorOverloading;

public class UseConstructorOverloading {

    public static void main(String[] args) {

        ConstructorOverloading  obj1 = new ConstructorOverloading();

        ConstructorOverloading  obj2 = new ConstructorOverloading(10);


        ConstructorOverloading  obj3 = new ConstructorOverloading(5,7,9);


        ConstructorOverloading  obj4 = new ConstructorOverloading(obj3);

          obj1.show();
          obj2.show();
          obj3.show();
          obj4.show();


    }
}
