import java.io.IOException;

public class SaveAndLoad {
    Player warrior;
    ConfigMaker configMaker;


    public SaveAndLoad(Player warrior, ConfigMaker configMaker) {
        this.warrior = warrior;
        this.configMaker = configMaker;
    }


    public void stats() throws IOException {
        String warriorName;
        warriorName = configMaker.readProp("name");
        System.out.println("[[[[[[[ STATS ]]]]]]]]]]");
        System.out.println("| Name returned " + warriorName);
        System.out.println("| strength  " + warrior.strength + "|");
        System.out.println("| dexterity " + warrior.dexterity + " |");
        System.out.println("| awareness " + warrior.awareness + " |");
        System.out.println("_____BODY____________");
        System.out.println("| right_arm " + warrior.rArm + " |");
        System.out.println("| left_arm  " + warrior.lArm + " |");
        System.out.println("| head      " + warrior.head + " |");
        System.out.println("| torso     " + warrior.torso + " |");
        System.out.println("| left_leg  " + warrior.lLeg + " |");
        System.out.println("______________________");
    }


    public void setProp() throws IOException {

        configMaker.setProp("name", warrior.getName());
        configMaker.setProp("strength", String.valueOf(warrior.strength));
        configMaker.setProp("dexterity", String.valueOf(warrior.dexterity));
        configMaker.setProp("awareness", String.valueOf(warrior.awareness));
        configMaker.setProp("right_arm", String.valueOf(warrior.rArm));
        configMaker.setProp("left_arm", String.valueOf(warrior.lArm));
        configMaker.setProp("head", String.valueOf(warrior.head));
        configMaker.setProp("torso", String.valueOf(warrior.torso));
        configMaker.setProp("left_leg", String.valueOf(warrior.lLeg));
    }


    public void readProp() throws IOException {
        System.out.println("After Reading config.ini file ..\n");
        String warriorName = configMaker.readProp("name");
        System.out.println("Name : " + warriorName);
        System.out.println("---------------------------------------");
        int strength = Integer.parseInt(configMaker.readProp("strength"));
        System.out.println("Strength : " + strength);

        int dexterity = Integer.parseInt(configMaker.readProp("dexterity"));
        System.out.println("dexterity : " + dexterity);

        int awareness = Integer.parseInt(configMaker.readProp("awareness"));
        System.out.println("awareness : " + awareness);

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


}
