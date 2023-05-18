import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigMaker {
    public Properties properties = new Properties();

    public void setProp(String title, String value) throws IOException {

        properties.setProperty(title, value);
        properties.store(new FileOutputStream("config.ini"),null);

    }
}
