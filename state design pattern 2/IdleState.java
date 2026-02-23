public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            System.out.println("Item selected. Please insert coins.");
            machine.setState(machine.getItemSelectedState());
        } else {
            System.out.println("Out of stock!");
            machine.setState(machine.getOutOfOrderState());
        }
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Select an item and pay first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(machine.getOutOfOrderState());
    }
}