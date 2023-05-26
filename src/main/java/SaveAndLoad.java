import java.io.IOException;
import java.util.Scanner;

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
        configMaker.setProp("strength", String.valueOf(player.strength));
        configMaker.setProp("dexterity", String.valueOf(player.dexterity));
        configMaker.setProp("awareness", String.valueOf(player.awareness));
        configMaker.setProp("right_arm", String.valueOf(player.rArm));
        configMaker.setProp("left_arm", String.valueOf(player.lArm));
        configMaker.setProp("head", String.valueOf(player.head));
        configMaker.setProp("torso", String.valueOf(player.torso));
        configMaker.setProp("left_leg", String.valueOf(player.lLeg));
        configMaker.setProp("right_leg", String.valueOf(player.rLeg));
    }


    public void readProp() throws IOException {
        System.out.println("After Reading config.ini file ..\n");
        String playerName = configMaker.readProp("name");
        System.out.println("Name : " + playerName);
        System.out.println("---------------------------------------");
        int strength = Integer.parseInt(configMaker.readProp("strength"));
        System.out.println("Strength : " + strength);

        int dexterity = Integer.parseInt(configMaker.readProp("dexterity"));
        System.out.println("Dexterity : " + dexterity);

        int awareness = Integer.parseInt(configMaker.readProp("awareness"));
        System.out.println("Awareness : " + awareness);

        System.out.println("__________________BODY_____________________");
        int head = Integer.parseInt(configMaker.readProp("head"));
        System.out.println("Head damage      : " + head);

        int leftArm = Integer.parseInt(configMaker.readProp("left_arm"));
        System.out.println("Left arm damage  : " + leftArm);

        int rightArm = Integer.parseInt(configMaker.readProp("right_arm"));
        System.out.println("Right arm damage : " + rightArm);

        int torso = Integer.parseInt(configMaker.readProp("torso"));
        System.out.println("Torso damage     : " + torso);

    }

    public Player askForContinue(SaveAndLoad saveAndLoad) throws IOException {

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

        return null;
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

    public  Player getPlayer() {
        return player;
    }
} //end of class
