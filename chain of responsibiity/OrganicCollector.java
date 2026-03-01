public class OrganicCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType().equalsIgnoreCase("Organic");
    }
    @Override
    protected void collect(WasteContainer container) {
        System.out.println("Organic Collector: Processing " + container.getCapacity() + "L of compost.");
    }
}