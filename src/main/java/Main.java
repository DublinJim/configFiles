import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        ConfigMaker configMaker = new ConfigMaker();
        SaveAndLoad saveAndLoad = new SaveAndLoad(configMaker);

        System.out.println("Config demo");

        saveAndLoad.askForContinue(saveAndLoad);

        Player player= saveAndLoad.getPlayer();
        System.out.println(player.getName());
clearScreen();
        System.out.println("back to main"+ " new player");




    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
