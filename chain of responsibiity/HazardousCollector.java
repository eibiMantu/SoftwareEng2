public class HazardousCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType().equalsIgnoreCase("Hazardous");
    }
    @Override
    protected void collect(WasteContainer container) {
        System.out.println("Hazardous Collector: NEUTRALIZING " + container.getCapacity() + "L of hazardous waste.");
    }
}