import java.util.PropertyResourceBundle;

/**
 * Created by Oleg Grigorjev on 31.12.2017.
 */
public class Utils {
    static String getHost() {
        return PropertyResourceBundle.getBundle("app").getString("rabbitmq.host");
    }
}
