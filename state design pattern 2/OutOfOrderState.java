public class OutOfOrderState implements VendingMachineState {
    @Override public void selectItem(VendingMachine m) { System.out.println("Machine Out of Order."); }
    @Override public void insertCoin(VendingMachine m) { System.out.println("Machine Out of Order."); }
    @Override public void dispenseItem(VendingMachine m) { System.out.println("Machine Out of Order."); }
    @Override public void setOutOfOrder(VendingMachine m) { System.out.println("Already Out of Order."); }
}