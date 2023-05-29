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
        System.out.println("After Reading config.ini file ..\n");
        String playerName = configMaker.readProp("name");


        System.out.println("---------------------------------------");
        int strength = Integer.parseInt(configMaker.readProp("strength"));
        int dexterity = Integer.parseInt(configMaker.readProp("dexterity"));
        int awareness = Integer.parseInt(configMaker.readProp("awareness"));

        System.out.println("__________________BODY_____________________");
        int head = Integer.parseInt(configMaker.readProp("head"));
        int leftArm = Integer.parseInt(configMaker.readProp("left_arm"));
        int rightArm = Integer.parseInt(configMaker.readProp("right_arm"));
        int torso = Integer.parseInt(configMaker.readProp("torso"));
        int lLeg = Integer.parseInt(configMaker.readProp("left_leg"));
        int rLeg = Integer.parseInt(configMaker.readProp("right_leg"));

        System.out.println("Name : " + playerName);
        System.out.println("Strength : " + strength);
        System.out.println("Dexterity : " + dexterity);
        System.out.println("Awareness : " + awareness);
        System.out.println("__________[BODY]__________");
        System.out.println("Head damage      : " + head);
        System.out.println("Torso damage     : " + torso);
        System.out.println("Left arm damage  : " + leftArm);
        System.out.println("Right arm damage : " + rightArm);
        System.out.println("Left leg damage  : " + lLeg);
        System.out.println("Right leg damage : " + rLeg);
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


        System.out.println("game begins");

    }

    private void createNewPlayer() throws IOException {
        System.out.println("New game");
        System.out.println("Enter Player Name...");
        String name = scanner.nextLine();
        System.out.println("Player named " + name);
        player = new Player();
        player.setName(name);
        System.out.println(player);
    }

    public Player getPlayer() {
        return player;
    }
} //end of class
