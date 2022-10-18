package test;
import java.io.IOException;
import java.util.logging;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class log {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(log.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);

        // SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        // ch.setFormatter(sFormat);
        ch.setFormatter(xml);

        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
