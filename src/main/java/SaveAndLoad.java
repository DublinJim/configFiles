import java.io.IOException;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class SaveAndLoad {
    public static Player player;
    public ConfigMaker configMaker;

    public String response;
    public Scanner scanner = new Scanner(System.in);

    public SaveAndLoad(ConfigMaker configMaker) {

        this.configMaker = configMaker;
    }


    public void stats() throws IOException {
        String playerName;
        Controller.clearScreen();
        playerName = configMaker.readProp("name");
        System.out.println("[[[[[[[ STATS ]]]]]]]]]]");
        System.out.println("| Name returned " + playerName);
        System.out.println("| strength  " + player.strength + "|");
        System.out.println("| dexterity " + player.dexterity + " |");
        System.out.println("| awareness " + player.awareness + " |");
        System.out.println("_____BODY____________");
        System.out.println("| right_arm " + player.rArm + " |");
        System.out.println("| left_arm  " + player.lArm + " |");
        System.out.println("| head      " + player.head + " |");
        System.out.println("| torso     " + player.torso + " |");
        System.out.println("| left_leg  " + player.lLeg + " |");
        System.out.println("______________________");
    }


    public void setProp() throws IOException {

        configMaker.setProp("name", player.getName());
        configMaker.setProp("strength", valueOf(player.strength));
        configMaker.setProp("dexterity", valueOf(player.dexterity));
        configMaker.setProp("awareness", valueOf(player.awareness));
        configMaker.setProp("right_arm", valueOf(player.rArm));
        configMaker.setProp("left_arm", valueOf(player.lArm));
        configMaker.setProp("head", valueOf(player.head));
        configMaker.setProp("torso", valueOf(player.torso));
        configMaker.setProp("left_leg", valueOf(player.lLeg));
        configMaker.setProp("right_leg", valueOf(player.rLeg));
    }


    public void readProp() throws IOException {
        Controller.clearScreen();
        System.out.println("After Reading config.ini file ..\n");
        String playerName = configMaker.readProp("name");
        player = new Player();

        player.setName(playerName);
        player.strength = Integer.parseInt(configMaker.readProp("strength"));
        System.out.println("---------------------------------------");
        player.strength = Integer.parseInt(configMaker.readProp("strength"));
        player.dexterity = Integer.parseInt(configMaker.readProp("dexterity"));
        player.awareness = Integer.parseInt(configMaker.readProp("awareness"));


        System.out.println("__________________BODY_____________________");
        player.head = Integer.parseInt(configMaker.readProp("head"));
        player.lArm = Integer.parseInt(configMaker.readProp("left_arm"));
        player.rArm = Integer.parseInt(configMaker.readProp("right_arm"));
        player.torso = Integer.parseInt(configMaker.readProp("torso"));
        player.lLeg = Integer.parseInt(configMaker.readProp("left_leg"));
        player.rLeg = Integer.parseInt(configMaker.readProp("right_leg"));

        System.out.println("Name : " + playerName);
        System.out.println("Strength : " + player.strength);
        System.out.println("Dexterity : " + player.dexterity);
        System.out.println("Awareness : " + player.awareness);
        System.out.println("__________[BODY]__________");
        System.out.println("Head damage      : " + player.head);
        System.out.println("Torso damage     : " + player.torso);
        System.out.println("Left arm damage  : " + player.lArm);
        System.out.println("Right arm damage : " + player.rArm);
        System.out.println("Left leg damage  : " + player.lLeg);
        System.out.println("Right leg damage : " + player.rLeg);
        System.out.println("____________________________");


    }


    public void askForContinue(SaveAndLoad saveAndLoad) throws IOException {

        do {
            System.out.println("Do you wish to continue a game  y/n ?");
            response = scanner.nextLine().toUpperCase();
            System.out.println(response);

        } while (!response.equals("N") && !response.equals("Y"));

        if (response.equals("Y")) {
            System.out.println("Loading game ... ... ... ");
            saveAndLoad.readProp();
        }

        if (response.equals("N")) {

            do {
                System.out.println("Confirm new game ....Y/N");
                response = scanner.nextLine().toUpperCase();
            } while (!response.equals("N") && !response.equals("Y"));

            createNewPlayer();
        }

    }

    private void createNewPlayer() throws IOException {
        System.out.println("New game");
        System.out.println("Enter Player Name...");
        String name = scanner.nextLine();
        System.out.println("Player named " + name);
        player = new Player();
        player.setName(name);

        player.chooseClass();
    }

    public Player getPlayer() {
        return player;
    }
} //end of class
