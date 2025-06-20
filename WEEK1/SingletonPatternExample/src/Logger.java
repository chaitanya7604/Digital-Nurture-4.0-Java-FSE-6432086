public class Logger {
    // Step 1: Private static variable to hold the single instance
    private static Logger instance;

    // Step 2: Private constructor to restrict instantiation
    private Logger() {
        System.out.println("Logger object created.");
    }

    // Step 3: Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Utility method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
