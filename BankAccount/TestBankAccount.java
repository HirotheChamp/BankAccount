public class TestBankAccount{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getAccountTotal());
    }
}