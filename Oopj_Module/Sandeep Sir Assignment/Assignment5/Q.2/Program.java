package assignment5.in;

public class Program {
    public static void main(String[] args) {
        // Accessing the singleton Logger instance
        Logger logger = Logger.getInstance();
        
        // Adding log messages
        logger.log("Application started");
        logger.log("Performing some operations");

        // Display all log messages
        System.out.println(logger);

        // Clearing the log
        logger.clearLog();
        System.out.println("Log after clearing:");
        System.out.println(logger);
    }
}

