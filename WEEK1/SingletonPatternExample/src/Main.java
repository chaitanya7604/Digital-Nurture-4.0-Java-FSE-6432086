public class Main {
    public static void main(String[] args) {
        // Get the singleton logger instances
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check if both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Same Logger instance used.");
        } else {
            System.out.println("Different Logger instances! Singleton failed.");
        }
    }
}
