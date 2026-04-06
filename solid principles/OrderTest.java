public class OrderTest {
    public static void main(String[] args) {
        // 1. Core Order Logic
        OrderProcessor processor = new OrderProcessor();
        double total = processor.calculateTotal(10.0, 2);
        System.out.println("Total: $" + total);
        processor.placeOrder("John Doe", "123 Main St");

        // 2. Specialized Services (Can be swapped or omitted easily)
        InvoiceGenerator invoiceGen = new PDFInvoiceGenerator();
        NotificationService emailService = new EmailNotificationService();

        invoiceGen.generateInvoice("order_123.pdf");
        emailService.sendNotification("johndoe@example.com");
    }
}