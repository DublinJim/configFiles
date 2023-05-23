import java.io.IOException;

public class SaveAndLoad {
    Warrior warrior;
    ConfigMaker configMaker;

    public SaveAndLoad(Warrior warrior, ConfigMaker configMaker) {
        this.warrior = warrior;
        this.configMaker = configMaker;
    }


    public void stats() throws IOException {
        String warriorName;
        warriorName = configMaker.readProp("name");
        System.out.println("[[[[[[[[[[[[[[[ STATS ]]]]]]]]]]]]]]]]]]]");
        System.out.println("Name returned " + warriorName);
        System.out.println("strength  " + warrior.strength);
        System.out.println("dexterity " + warrior.dexterty);
        System.out.println("awareness " + warrior.awarness);
        System.out.println("________________BODY______________________");
        System.out.println("right_arm " + warrior.rArm);
        System.out.println("left_arm  " + warrior.lArm);
        System.out.println("head      " + warrior.head);
        System.out.println("torso     " + warrior.torso);
        System.out.println("left_leg  " + warrior.lLeg);
        System.out.println("_________________________________________");
    }


    public void setProp() throws IOException {

        configMaker.setProp("name", warrior.getName());
        configMaker.setProp("strength", String.valueOf(warrior.strength));
        configMaker.setProp("dexterity", String.valueOf(warrior.dexterty));
        configMaker.setProp("awareness", String.valueOf(warrior.awarness));
        configMaker.setProp("right_arm", String.valueOf(warrior.rArm));
        configMaker.setProp("left_arm", String.valueOf(warrior.lArm));
        configMaker.setProp("head", String.valueOf(warrior.head));
        configMaker.setProp("torso", String.valueOf(warrior.torso));
        configMaker.setProp("left_leg", String.valueOf(warrior.lLeg));
    }

}
