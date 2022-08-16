package ConstructorOverloading;

public class ConstructorOverloading {
    private int l,b,h;

      public ConstructorOverloading(){

          l= b = h =0;
      }

    public ConstructorOverloading(int s){

         l= b =h = s;
    }

    public ConstructorOverloading(int i, int j, int k)
    {
          l = i;
          b = j;
          h = k;

    }

    public ConstructorOverloading(ConstructorOverloading p){

          l = p.l;
          b = p.b;
          h = p.h;
    }

    public  void  show(){
        System.out.println(l +","+ b + "," + h);
    }
}
