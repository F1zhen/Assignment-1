package Logger_pattern;
public class Logger {

    //step 1
    private static Logger instance;


    //step2
    private Logger(){


    }

    //step 3
    public static Logger getInstance(){
        if (instance==null){
            instance = new Logger();
        }
        return instance;

    }

    //step 4
    public static void logmessage(){
        System.out.println("Hello World");
    }


}
