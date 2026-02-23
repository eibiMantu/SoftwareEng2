public class VendingMachine {
    private VendingMachineState idleState = new IdleState();
    private VendingMachineState itemSelectedState = new ItemSelectedState();
    private VendingMachineState dispensingState = new DispensingState();
    private VendingMachineState outOfOrderState = new OutOfOrderState();

    private VendingMachineState currentState;
    private int inventory;
    private int balance = 0;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.currentState = (inventory > 0) ? idleState : outOfOrderState;
    }

    // Delegation Methods
    public void selectItem() { currentState.selectItem(this); }
    public void insertCoin() { currentState.insertCoin(this); }
    public void dispenseItem() { 
        currentState.dispenseItem(this); 
    }

    // Getters and Setters
    public void setState(VendingMachineState state) { this.currentState = state; }
    public void releaseItem() {
        if (inventory > 0) {
            inventory--;
            balance = 0;
            System.out.println("Item dispensed successfully!");
        }
    }
    
    public int getInventory() { return inventory; }
    public int getBalance() { return balance; }
    public void addBalance(int amount) { this.balance += amount; }
    
    // State Getters
    public VendingMachineState getIdleState() { return idleState; }
    public VendingMachineState getItemSelectedState() { return itemSelectedState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public VendingMachineState getOutOfOrderState() { return outOfOrderState; }
}