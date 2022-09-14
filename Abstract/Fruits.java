package Abstract;

abstract class Fruits{

  abstract void taste();

}

class Mango extends Fruits{

    void taste(){

       System.out.println("The test of Mango sweat");
   }

}
class  Apple extends Fruits{
    void taste(){
        System.out.println("The test of Apple is sweat as well as soure ");
    }
}


class UseFruits{

    public static void main(String[] args) {
        Fruits f = new Mango();
        f.taste();

        f = new Apple();
        f.taste();
    }
}

