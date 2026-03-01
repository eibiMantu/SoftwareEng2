public class RecyclableCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType().equalsIgnoreCase("Recyclable");
    }
    @Override
    protected void collect(WasteContainer container) {
        System.out.println("Recyclable Collector: Sorting " + container.getCapacity() + "L of recyclables.");
    }
}