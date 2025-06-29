import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loggin {
    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}