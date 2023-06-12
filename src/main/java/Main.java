import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//load the classes into objects
        SaveAndLoad saveAndLoad = new SaveAndLoad(new ConfigMaker());
        Map map = new Map();

        System.out.println("Config demo");
        saveAndLoad.askForContinue(saveAndLoad);
        Player player = saveAndLoad.getPlayer();
String redColor ="\u001b[31m";
String blueColor ="\u001b[32m";
String resetColor ="\u001b[0m";

        map.showMap();
        System.out.println( redColor+"\n\n--Begin the adventure--"+resetColor);
        System.out.println("Go North enter the ADGA building");
        System.out.println();
        System.out.println(blueColor+"What to do..?"+resetColor);

        map.playerMove();
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}// end class
