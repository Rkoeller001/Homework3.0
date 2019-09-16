package Bank;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Ryan",900.00);
        System.out.println(account1);
        account1.deposit(60);
        account1.widthdrawal(900000000000.0);

//        Account account2 = new Account("bailey",3000.00);
//        System.out.println(account2);
//        account2.deposit(40);

    }


}

