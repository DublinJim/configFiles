import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {



        ConfigMaker configMaker = new ConfigMaker();
        SaveAndLoad saveAndLoad = new SaveAndLoad(configMaker);
        System.out.println("Config demo");
        saveAndLoad.askForContinue(saveAndLoad); //inception dude !!!!
        System.out.println("back to main");
    }


}
