import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Config demo");
        System.out.println("Do you wish to continue a game  y/n ?");
        Scanner scanner = new Scanner(System.in);

        while (true){
            if (scanner.hasNextLine()) {
                String response =scanner.nextLine();
                if ("y".equals(response)) {
                    System.out.println("yes");
                    break;
                }else System.out.println("no");
            }

        }




        Player warrior = new Player("Cameron", Player.typeClass.WARRIOR);
        ConfigMaker configMaker = new ConfigMaker();
        SaveAndLoad saveAndLoad = new SaveAndLoad(warrior, configMaker);

        saveAndLoad.stats();
        saveAndLoad.setProp();
        saveAndLoad.readProp();
    }


}
