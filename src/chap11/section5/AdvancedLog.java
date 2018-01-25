package chap11.section5;

import java.io.IOException;
import java.util.logging.*;

public class AdvancedLog {
    private static final Logger myLogger = Logger.getLogger("chap11.section5");

    public static void main(String[] args) {
        myLogger.setLevel(Level.ALL);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.CONFIG);
        myLogger.addHandler(handler);
//        try {
//            Handler handler2 = new FileHandler();
//            handler2.setLevel(Level.ALL);
//            myLogger.addHandler(handler2);
//        } catch (IOException iox) {
//            iox.printStackTrace();
//        }
        myLogger.setUseParentHandlers(false);

        myLogger.severe("severe");
        myLogger.warning("warning");
        myLogger.info("info");
        myLogger.config("config");
        myLogger.fine("fine");
        myLogger.finer("finer");
        myLogger.finest("finest");

        myLogger.log(Level.WARNING, "warning2");
    }
}
