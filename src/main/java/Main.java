import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        Player warrior = new Player("Cameron", Player.typeClass.WARRIOR);
        ConfigMaker configMaker = new ConfigMaker();
        SaveAndLoad saveAndLoad = new SaveAndLoad(warrior, configMaker);
        System.out.println("Config demo");
        saveAndLoad.askForContinue(saveAndLoad); //inception dude !!!!

    }


}
