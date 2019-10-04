package logginglog4j;

public class Main {

    private static final org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.trace("Here is a trace message");
        LOGGER.debug("Here is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("Here is a warning message");
        LOGGER.error("This is an error message");
        LOGGER.fatal("Here is a fatal message");
    }

}
