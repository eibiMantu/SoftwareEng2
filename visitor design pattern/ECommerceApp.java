import java.util.ArrayList;
import java.util.List;

public class ECommerceApp {
    public static void main(String[] args) {
        List<Furniture> cart = new ArrayList<>();
        cart.add(new Chair(true));        // Folding chair
        cart.add(new Table(25.5));        // 25.5kg table
        cart.add(new Sofa(12.0));         // 12km delivery distance

        ShippingVisitor shippingCalculator = new StandardShippingVisitor();
        double totalShipping = 0;

        System.out.println("--- Shipping Calculation Report ---");
        for (Furniture item : cart) {
            double cost = item.accept(shippingCalculator);
            System.out.println("Item: " + item.getClass().getSimpleName() + " | Shipping Cost: ₱" + cost);
            totalShipping += cost;
        }

        System.out.println("-----------------------------------");
        System.out.println("Total Shipping Cost: ₱" + totalShipping);
    }
}