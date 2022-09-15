package TreeMap.BankAccount;


public class BankAccount {
    private Integer accountId;
    private String  name;
    private  Double blance;


    public BankAccount(Integer accountId, String name, Double blance) {
        this.accountId = accountId;
        this.name = name;
        this.blance = blance;
    }
//    seter

    public void setName(String name) {
        this.name = name;
    }

    public void setBlance(Double blance) {
        this.blance = blance;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }


//    geter

    public Integer getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public Double getBlance() {
        return blance;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", blance=" + blance +
                '}';
    }

}
