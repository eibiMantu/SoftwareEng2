public interface TelcoSubscription {
    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
    
}