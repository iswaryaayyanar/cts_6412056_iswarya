public class ApplicationRunner {
    public static void main(String[] args) {
        EventLogger firstLogger = EventLogger.getLogger();
        EventLogger secondLogger = EventLogger.getLogger();

        firstLogger.write("System started");
        secondLogger.write("User logged in");

        if (firstLogger == secondLogger) {
            System.out.println("Both references point to the same logger instance.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}

class EventLogger {
    private static EventLogger logger;

    private EventLogger() {
        System.out.println("EventLogger setup completed.");
    }

    public static EventLogger getLogger() {
        if (logger == null) {
            logger = new EventLogger();
        }
        return logger;
    }

    public void write(String logEntry) {
        System.out.println("ENTRY: " + logEntry);
    }
}
