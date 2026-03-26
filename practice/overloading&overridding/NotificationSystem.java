// Superclass: Defines the core notification logic
class Notifier {

    // 1. Public: General Alert (Message only)
    public void send(String message) {
        System.out.println("Public Alert: " + message);
    }

    // 2. Protected: Email Alert (Message + Email)
    protected void send(String message, String email) {
        System.out.println("Protected Email sent to " + email + ": " + message);
    }

    // 3. Default: SMS Alert (Message + Phone)
    void send(String message, long phoneNumber) {
        System.out.println("Default SMS sent to " + phoneNumber + ": " + message);
    }

    // 4. Private: Internal Logging (Not accessible to Subclass)
    private void send(String message, boolean isSilent) {
        System.out.println("Private Internal Log: " + message + " (Silent: " + isSilent + ")");
    }

    // Wrapper to allow subclass to trigger the private method indirectly
    public void triggerInternalLog(String msg) {
        send(msg, true); // Calls the private overloaded method
    }
}

// Subclass: Inherits and utilizes the Notifier methods
class AppNotifier extends Notifier {
    public void displayCapabilities() {
        System.out.println("--- AppNotifier accessing inherited methods ---");
        
        // Calling overloaded methods inherited from Notifier
        send("System Update available.");              // Calls Public
        send("Welcome!", "user@example.com");         // Calls Protected
        send("Your OTP is 1234", 9876543210L);       // Calls Default
        
        // send("Critical Error", false); 
        // UNCOMMENTING THE ABOVE LINE CAUSES A COMPILE ERROR: 
        // 'send(String, boolean) has private access in Notifier'
        
        System.out.println("Accessing private method indirectly:");
        triggerInternalLog("App Crash Report");       // Calls Private via Public wrapper
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        AppNotifier myApp = new AppNotifier();
        myApp.displayCapabilities();
    }
}