public class WasteManagementSystem {
    public static void main(String[] args) {
        // Initialize the chain
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        // Build the chain: Organic -> Recyclable -> Hazardous
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        // Test the system
        WasteContainer[] loads = {
            new WasteContainer("Organic", 50),
            new WasteContainer("Hazardous", 10),
            new WasteContainer("Recyclable", 120)
        };

        for (WasteContainer load : loads) {
            organic.processWaste(load);
        }
    }
}
