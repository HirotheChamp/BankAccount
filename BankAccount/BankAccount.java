public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static int accountTotal = 0;

    public BankAccount() {
        checkingBalance = 0;
        savingsBalance = 0;
        numberOfAccounts ++;
        



    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }
    public static int getAccountTotal(){
        return accountTotal;
    }

    public void depositMoney(String account, double amount){
        if(account.equals("checkingBalance") && checkingBalance >= amount){
            checkingBalance -= amount;
        }else if (account.equals("savingsBalance") && savingsBalance >= amount){
            savingsBalance -= amount;
        } else {
            System.out.println("Insufficient Funds");
        }
        accountTotal -= amount;
    }
    public void totalFunds(){
        System.out.println("Checking: " + checkingBalance + "Savings: " +savingsBalance); 
    }

}
