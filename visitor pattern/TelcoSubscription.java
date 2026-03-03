public interface TelcoSubscription {
    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallOffer unliPackage, boolean unliCallText);
    
    // Getters for the client program
    public String getTelcoName();
    public double getPromoPrice();
    public boolean getUnliCallText();
}