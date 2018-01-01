import java.io.IOException;
import java.util.Properties;

/**
 * Created by Oleg Grigorjev on 31.12.2017.
 */
public class Utils {
    static String getHost() {
        try {
            Properties properties = new Properties();
            properties.load(Utils.class.getResourceAsStream("/app.properties"));
            return properties.getProperty("rabbitmq.host");
        } catch (IOException e) {
            return "localhost";
        }
    }
}
