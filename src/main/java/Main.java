import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//load the classes into objects
        SaveAndLoad saveAndLoad = new SaveAndLoad(new ConfigMaker());
        Map map = new Map();

        System.out.println("Config demo");
        saveAndLoad.askForContinue(saveAndLoad);
        Player player = saveAndLoad.getPlayer();

        System.out.println("--Begin the adventure--");
        map.showMap();
        map.mapStart();
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}// end class
