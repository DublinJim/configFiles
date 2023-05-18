import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Config demo");

        ConfigMaker configMaker = new ConfigMaker();
        try {
            configMaker.setProp("hello","12");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
