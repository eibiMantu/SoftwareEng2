public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double price) {
        // Logic mapping based on telco requirements
        if (telcoName.equalsIgnoreCase("Smart")) return "15GB for ₱" + price;
        if (telcoName.equalsIgnoreCase("Globe")) return "10GB for ₱" + price;
        if (telcoName.equalsIgnoreCase("Ditto")) return "8GB for ₱" + price;
        return "Unknown Plan";
    }
}

class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            if (telcoName.equalsIgnoreCase("Globe")) return "Unlimited calls and texts within network.";
            if (telcoName.equalsIgnoreCase("Ditto")) return "Unlimited calls and texts to all networks.";
        }
        return "No free calls or texts. Charged per use.";
    }
}