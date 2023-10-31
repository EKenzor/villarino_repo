public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(20290516, "Glydel Villarino", 3000000.0);

        myAccount.displayBalance();  // Display initial balance
        myAccount.deposit(50000.0);   
        myAccount.withdraw(120000.0);  
        myAccount.displayBalance();  // Display updated balance
    }
}