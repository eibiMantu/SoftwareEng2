public abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void processWaste(WasteContainer container) {
        if (canHandle(container)) {
            collect(container);
        } else if (nextCollector != null) {
            nextCollector.processWaste(container);
        } else {
            System.out.println("ALERT: No collector found for waste type: " + container.getType());
        }
    }

    protected abstract boolean canHandle(WasteContainer container);
    protected abstract void collect(WasteContainer container);
}