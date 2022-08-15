package InitializerBlock;

public class InitailzerBlock {

    private static int speed;


    public  InitailzerBlock(){
        System.out.println("Speed is " + speed);
    }

    public  InitailzerBlock(int a){
       speed = a;
        System.out.println("speed is " + speed);
    }

    {
        speed = 100;
        System.out.println("speed is " + speed);
    }
   static  {
         speed = 10;
        System.out.println("speed is " + speed);
    }
}
