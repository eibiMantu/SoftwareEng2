public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); // set acct to active state

        myAccount.activate(); // displays "Account is already activated!"

        // Suspend the account
        myAccount.suspend(); // displays "Account is suspended!"

        // Activate the account
        myAccount.activate(); // displays "Account is activated!"
        
        // Deposit to the account
        myAccount.deposit(1000.0); // updates balance and calls toString()

        // Withdraw to the account
        myAccount.withdraw(100.0); // updates balance and calls toString()

        // Close the account
        myAccount.close(); // displays "Account is closed!"

        // Activate the account
        myAccount.activate(); // Displays "You cannot activate a closed account!"	

        // Suspend the account
        myAccount.suspend(); // Displays "You cannot suspend a closed account!"

        // Withdraw from the account
        myAccount.withdraw(500.0); // Displays restriction and calls toString()

        // Deposit to the account
        myAccount.deposit(1000.0); // Displays restriction and calls toString()
    }
}