public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        machine.addBalance(10); // Example fixed price
        System.out.println("Coin inserted. Current balance: " + machine.getBalance());
        // For simplicity, we transition to dispensing immediately
        machine.setState(machine.getDispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Payment required before dispensing.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(machine.getOutOfOrderState());
    }
}