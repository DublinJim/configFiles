import java.io.IOException;
import java.util.Random;

public class Player extends Body {

    public int strength;
    public int awareness;
    public int dexterity;
    public String name;

    public char response;

    public Player() throws IOException {

        System.out.println("Please choose a skill set\n ");
        System.out.println("Warrior : 1");
        System.out.println("Cleric  : 2");
        System.out.println("Mage    : 3");
        System.out.println("Thief   : 4");
        response = (char) System.in.read();


        switch (response) {
            case '1':
                System.out.println("Warrior");
                strength = 100;
                awareness = 90;
                dexterity = 50;

                System.out.println("Strength = " + strength);
                System.out.println("Awareness = " + awareness);
                System.out.println("Dexterity = " + dexterity);
                break;

            case '2':
                System.out.println("Cleric");
                strength = 50;
                awareness = 70;
                dexterity = 60;

                System.out.println("Strength =" + strength);
                System.out.println("Awareness =" + awareness);
                System.out.println("Dexterity =" + dexterity);
                break;
            case '3':
                System.out.println("Mage");
                strength = 40;
                awareness = 80;
                dexterity = 75;

                System.out.println("Strength =" + strength);
                System.out.println("Awareness =" + awareness);
                System.out.println("Dexterity =" + dexterity);
                break;
            case '4':
                System.out.println("Thief");
                strength = 60;
                awareness = 95;
                dexterity = 90;

                System.out.println("Strength =" + strength);
                System.out.println("Awareness =" + awareness);
                System.out.println("Dexterity =" + dexterity);
                break;
            default:
                System.out.println("invalid input");

        }

    }


    public void randomFactors() {
        Random rand = new Random();
        int muscle = rand.nextInt(9) + 1;
        strength += muscle;
        int sharp = rand.nextInt(5);
        awareness += sharp;
        int quick = rand.nextInt(6);
        dexterity += quick;
        System.out.println("New settings after random applied \n" + "Muscle " + muscle + " sharp " + sharp + " dexterity " + quick);
    }



    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAwareness() {
        return awareness;
    }

    public void setAwareness(int awareness) {
        this.awareness = awareness;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();

    }


    @Override
    public String toString() {
        return "Player{" +
                "strength=" + strength +
                ", awareness=" + awareness +
                ", dexterity=" + dexterity +
                ", name='" + name + '\'' +
                ", response=" + response +
                ", torso=" + torso +
                ", rArm=" + rArm +
                ", lArm=" + lArm +
                ", lLeg=" + lLeg +
                ", rLeg=" + rLeg +
                ", head=" + head +
                "} " + super.toString();
    }

    public enum typeClass {
        WARRIOR,
        CLERIC,
        MAGE,
        THIEF
    }


}

