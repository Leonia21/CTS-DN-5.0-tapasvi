class Logger {
    private static Logger logger;
    private Logger() {
        System.out.println("Logger started");
    }
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    public void log(String message) {
        System.out.println("Message: " + message);
    }
}

public class SingletonPatternExample {
        public static void main(String[] args) {
            Logger log1 = Logger.getInstance();
            log1.log("user1");
            Logger log2 = Logger.getInstance();
            log2.log("user2");
            System.out.println();
            if (log1 == log2) {
                System.out.println("Same Logger object is used.");
            } else {
                System.out.println("Different Logger objects are created.");
            }
        }
}