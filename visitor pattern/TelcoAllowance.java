import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class TelcoAllowance implements UsagePromo {
    
    private static final Map<String, Double> allowanceRates = new HashMap<>();
   
    private final Map<String, String> cache = new HashMap<>();

    static {
        allowanceRates.put("smart", 15.0);
        allowanceRates.put("globe", 10.0);
        allowanceRates.put("ditto", 8.0);
    }

    @Override
    public String showAllowance(String telcoName, double price) {
        String key = telcoName.toLowerCase() + "|" + price;
        return cache.computeIfAbsent(key, k -> {
            Double gb = allowanceRates.get(telcoName.toLowerCase());
            if (gb == null) {
                return "Unknown Plan";
            }
            return gb + "GB for ₱" + price;
        });
    }
}

class UnliCallTextPackage implements UnliCallsTextOffer {
    private static final Map<String, String> unliMap = new HashMap<>();

    static {
        unliMap.put("globe", "Unlimited calls and texts within network.");
        unliMap.put("ditto", "Unlimited calls and texts to all networks.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "No free calls or texts. Charged per use.";
        }
        return unliMap.getOrDefault(telcoName.toLowerCase(), "No free calls or texts. Charged per use.");
    }
}