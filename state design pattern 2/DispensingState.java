public class DispensingState implements VendingMachineState {
    @Override
    public void dispenseItem(VendingMachine machine) {
        machine.releaseItem();
        if (machine.getInventory() > 0) {
            machine.setState(machine.getIdleState());
        } else {
            machine.setState(machine.getOutOfOrderState());
        }
    }
    // Other methods print "Please wait, dispensing..."
    @Override public void selectItem(VendingMachine m) { System.out.println("Busy dispensing."); }
    @Override public void insertCoin(VendingMachine m) { System.out.println("Busy dispensing."); }
    @Override public void setOutOfOrder(VendingMachine m) { machine.setState(machine.getOutOfOrderState()); }
}