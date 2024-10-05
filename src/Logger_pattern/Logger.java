package Logger_pattern;

// This class Logger is trying to follow the Singleton pattern.
// It means only one Logger can exist in the whole program.
public class Logger {

    // Step 1: Here we create a static variable to hold the one Logger instance.
    private static Logger instance;

    // Step 2: This is a private constructor. It prevents anyone from making a new Logger directly.
    private Logger() {
        // We can add some setup code here if we need it.
    }

    // Step 3: This method gets the one and only Logger instance.
    public static Logger getInstance() {
        // If the instance is not created yet, we create it now.
        if (instance == null) {
            instance = new Logger();
        }
        // Then we return the instance we have (either new or existing).
        return instance;
    }

    // Step 4: This method is for logging messages.
    public static void logmessage() {
        // It just prints "Hello World" to the console.
        System.out.println("Hello World");
    }
}
