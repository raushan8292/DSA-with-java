package AssignmentPassingValue;

//   Q1  Create a class called Num having the following data & methods:
//
//        1. int i: An instance member
//
//        2. int j: An instance member
//
//        3. setNum(): This should be parametrize and should initialize i and j
//
//        4. swap(): This method should accept two objects as argument and swap their i & j correspondingly
//
//        5. show(); To display i andj
//
//        Finally design the class UseNum, having the method main(), create 2 objects of Num class called N! and N2.
//        Initialize them by calling setNum(),and then swap them. At last display the swapped values.

public class UseTest {

    public static void main(String[] args) {

       Test t1 = new Test();
       t1.setNumber(55,66);

       Test t2 = new Test();
       t2.setNumber(5,6);

       Test t3 = new Test();
       t3.swap(t1 , t2);

       t1.show();
       t2.show();

    }
}
