import java.util.Random;

public class Player extends Body {
public enum typeClass{
    WARRIOR,
    CLERIC,
    MAGE,
    THIEF
}


    public int strength = 10;
    public int awareness = 5;
    public int dexterity = 5;

public String name;
    public Player(String name,typeClass player) {
        this.name = name;
        typeClass typeClass = player;
        System.out.println("Player Created "+typeClass);
        randomFactors();

    }

    public void randomFactors() {
        Random rand = new Random();
        int muscle = rand.nextInt(9)+1;
        strength += muscle;
        int sharp = rand.nextInt(5);
        awareness += sharp;
        int quick=rand.nextInt(6);
        dexterity += quick;
        System.out.println("New settings after random applied \n"+"Muscle "+muscle+" sharp "+sharp+" dexterity "+quick);
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
        this.name = name;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "strength=" + strength +
                ", awarness=" + awareness +
                ", dexterty=" + dexterity +
                ", name='" + name + '\'' +
                ", torso=" + torso +
                ", rArm=" + rArm +
                ", lArm=" + lArm +
                ", lLeg=" + lLeg +
                ", head=" + head +
                "} " + super.toString();
    }
}

