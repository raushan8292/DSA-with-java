package TreeMap.BankAccount;

import java.util.HashMap;

public class Bank{
    private HashMap<Integer, BankAccount> accounts  = null;

    public Bank(){

        accounts = new HashMap<>();
    }

   public boolean addAccount(BankAccount Obj){
          //put method add kar paya to null dega nai kar paya to previous Key dega

        if(accounts.put(Obj.getAccountId(),Obj)==null )

            return true;
        else
            return false;
   }

   public BankAccount getAccountId(Integer Id){

        return accounts.get(Id);
   }

   public boolean removeAccount(Integer Id){
//remove method accounts remove hone pe output object deta hai or nai hone pe null deta to
//  isi ka ulta use kar check kar lenga account remove hua ki nai
        if(accounts.remove(Id)==null)
        return false;
        return true;

   }


   public  int  getCount(){

        return accounts.size();
   }

   public  HashMap<Integer,BankAccount> getAllAccount(){

        return accounts;
   }


}
