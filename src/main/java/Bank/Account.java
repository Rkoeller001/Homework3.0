package Bank;

public class Account {
    public String customerName;
    public double accountBalance;



    public Account(String customerName, double accountBalance){
        this.customerName = customerName;
        this.accountBalance = accountBalance;

    }
    public void deposit(double depositCash){
        accountBalance = accountBalance + depositCash;
        System.out.println(accountBalance);
    }
    public void widthdrawal(double withdrawalCash){
        if (accountBalance > withdrawalCash){
            accountBalance = accountBalance - withdrawalCash;
            System.out.println(accountBalance);
        }else{
            System.out.println("no funds");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
