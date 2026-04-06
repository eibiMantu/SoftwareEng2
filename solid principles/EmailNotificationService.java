public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}