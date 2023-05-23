import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Config demo");

        Player warrior = new Player("Cameron");
        ConfigMaker configMaker = new ConfigMaker();
        SaveAndLoad saveAndLoad = new SaveAndLoad(warrior, configMaker);

        saveAndLoad.stats();
        saveAndLoad.setProp();
        saveAndLoad.readProp();
    }


}
