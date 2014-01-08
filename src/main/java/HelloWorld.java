import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created by kevin on 7/01/14.
 */
public class HelloWorld {

    static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args )
    {
        DOMConfigurator.configure("src/log4j.xml");

        logger.debug("Hello world!");
        logger.info("Hello world!from INFO");
    }


}
