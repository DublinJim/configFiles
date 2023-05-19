import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Config demo");

        Warrior cameron = new Warrior("Cameron");
        System.out.println(cameron.toString());
        ConfigMaker configMaker = new ConfigMaker();


        try {
            configMaker.setProp("lvl", "12");
            configMaker.setProp("pwr", "10");
            configMaker.setProp("health", "50");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        configMaker.readProp("lvl");


    }


}
