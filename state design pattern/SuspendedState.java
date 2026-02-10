public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account, Double depositAmount) {
        System.out.println("No deposits allowed while suspended!");
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("No withdrawals allowed while suspended!");
    }

    @Override
    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}