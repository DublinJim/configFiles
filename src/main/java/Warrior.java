import java.util.Random;

public class Warrior extends Body {
    public int strength = 10;
    public int awarness = 5;
    public int dexterty = 5;

public String name;
    public Warrior(String name) {
        this.name = name;
        System.out.println("Warrior Created");
        randomFactors();
    }

    public void randomFactors() {
        Random rand = new Random();
        int muscle = rand.nextInt(9)+1;
        strength += muscle;
        int sharp = rand.nextInt(5);
        awarness += sharp;
        int quick=rand.nextInt(6);
        dexterty += quick;
        System.out.println("New settings after random applied \n"+"Muscle "+muscle+" sharp "+sharp+" dexterity "+quick);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAwarness() {
        return awarness;
    }

    public void setAwarness(int awarness) {
        this.awarness = awarness;
    }

    public int getDexterty() {
        return dexterty;
    }

    public void setDexterty(int dexterty) {
        this.dexterty = dexterty;
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
                ", awarness=" + awarness +
                ", dexterty=" + dexterty +
                ", name='" + name + '\'' +
                ", torso=" + torso +
                ", rArm=" + rArm +
                ", lArm=" + lArm +
                ", lLeg=" + lLeg +
                ", head=" + head +
                "} " + super.toString();
    }
}

