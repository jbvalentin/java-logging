package commonslogging;

public class Main {

    private static final org.apache.commons.logging.Log LOGGER = org.apache.commons.logging.LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        // JCL is not a logging framework implementation itself. Rather, it is an interface for other logging implementations.

        LOGGER.trace("This a trace message");
        LOGGER.debug("Here is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is an warning message");
        LOGGER.error("This is an error message");
        LOGGER.fatal("This is a fatal message");

    }
}
