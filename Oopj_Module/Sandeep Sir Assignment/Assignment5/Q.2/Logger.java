package assignment5.in;

import java.util.ArrayList;

public class Logger {
    private static Logger reference = null;
    private static int currentMessage = 0;
    private ArrayList<String> ar = new ArrayList<>();

    // Singleton instance method
    public static Logger getInstance() {
        if (Logger.reference == null) {
            Logger.reference = new Logger();
        }
        return reference;
    }

    // Method to log messages
    public void log(String message) {
        Logger.currentMessage++;
        this.ar.add(message);
    }

    // Method to retrieve the last log message
    public String getLog() {
        if (ar.size() > 0) {
            return this.ar.get(Logger.currentMessage - 1);
        } else {
            return "There is no Log Present";
        }
    }

    // Method to clear the logs
    public void clearLog() {
        Logger.currentMessage = 0;
        this.ar.clear();
    }

    // toString method to display all log messages
    @Override
    public String toString() {
        if (ar.isEmpty()) {
            return "No logs available.";
        }
        StringBuilder logs = new StringBuilder("Logs:\n");
        for (String log : ar) {
            logs.append(log).append("\n");
        }
        return logs.toString();
    }
}

