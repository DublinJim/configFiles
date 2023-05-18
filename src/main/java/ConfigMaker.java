import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigMaker {
    public Properties properties = new Properties();

    public void setProp(String title, String value) throws IOException {

        properties.setProperty(title, value);
        properties.store(new FileOutputStream("config.ini"), null);

    }

    public void readProp(String title) throws IOException {
        properties.load(new FileInputStream("config.ini"));
        String result = properties.getProperty(title);
        System.out.println(result);

            }
}
