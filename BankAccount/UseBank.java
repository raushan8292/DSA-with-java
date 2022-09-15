package TreeMap.BankAccount;

import java.util.HashMap;
import java.util.Iterator;

public class UseBank {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(1001, "Raushan", 555.00);
        BankAccount b2 = new BankAccount(1002, "Ravi", 880.6);
        BankAccount b3 = new BankAccount(1003, "Amuresh", 8896.6);
        BankAccount b4 = new BankAccount(1004, "rorkee", 812213130.6);
        BankAccount b5 = new BankAccount(1004, "rorkee", 812213130.6);

        Bank b = new Bank();
        System.out.println("your acoount " + b1.getAccountId() + " added : " + b.addAccount(b1));
        System.out.println("your acoount " + b2.getAccountId() + " added : " + b.addAccount(b2));
        System.out.println("your acoount " + b3.getAccountId() + " added : " + b.addAccount(b3));
        System.out.println("your acoount " + b4.getAccountId() + " added : " + b.addAccount(b4));
        //        Hence proof HashMap not contains Duplicate Value
        System.out.println("your acoount " + b5.getAccountId() + " added : " + b.addAccount(b5));


//        Detail of Account

        System.out.println("Details of Account 1001 " + b.getAccountId(1001));

        // remove the account

        System.out.println("Removing id 1004 " + b.removeAccount(1004));
        System.out.println("Details of Account 1004 " + b.getAccountId(1004));


        HashMap <Integer, BankAccount> accounts = b.getAllAccount();

        Iterator it = accounts.entrySet().iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


      //  if you want output always come in sorted order then use TreeMap ex last of collection change it





    }
}
