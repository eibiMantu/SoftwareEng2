public class StandardShippingVisitor implements ShippingVisitor {
    
    @Override
    public double visit(Chair chair) {
        // Flat rate: Folding chairs are cheaper to ship
        return chair.isFolding() ? 100.0 : 200.0;
    }

    @Override
    public double visit(Table table) {
        // Weight-based: ₱15 per kg
        return table.getWeight() * 15.0;
    }

    @Override
    public double visit(Sofa sofa) {
        // Distance-based: ₱50 per km + bulky handling fee
        return (sofa.getDistanceKm() * 50.0) + 500.0;
    }
}