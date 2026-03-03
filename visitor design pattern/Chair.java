public class Chair implements Furniture {
    private boolean isFolding;

    public Chair(boolean isFolding) {
        this.isFolding = isFolding;
    }

    public boolean isFolding() { return isFolding; }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}