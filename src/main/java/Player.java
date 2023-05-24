import java.util.Random;
import java.util.Scanner;

public class Player extends Body {

    public int strength;
    public int awareness;
    public int dexterity;
    public String name;

    public String response;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player Name ? \n");
        name= String.valueOf(scanner.hasNextLine());
        Player name = new Player();

        System.out.println("Please choose a skill set ");
        System.out.println("Warrior : 1");
        System.out.println("Cleric  : 2");
        System.out.println("Mage    : 3");
        System.out.println("Thief   : 4");

        while (true) {
            if (scanner.hasNextLine()) {

                switch (response){
                    case "1":
                strength=10;
                awareness=5;
                dexterity=5;
                        System.out.println("Warrior chosen");
                break;

                }
            }
            }
            // randomFactors();

        }

        public void randomFactors () {
            Random rand = new Random();
            int muscle = rand.nextInt(9) + 1;
            strength += muscle;
            int sharp = rand.nextInt(5);
            awareness += sharp;
            int quick = rand.nextInt(6);
            dexterity += quick;
            System.out.println("New settings after random applied \n" + "Muscle " + muscle + " sharp " + sharp + " dexterity " + quick);
        }

        public int getStrength () {
            return strength;
        }

        public void setStrength ( int strength){
            this.strength = strength;
        }

        public int getAwareness () {
            return awareness;
        }

        public void setAwareness ( int awareness){
            this.awareness = awareness;
        }

        public int getDexterity () {
            return dexterity;
        }

        public void setDexterity ( int dexterity){
            this.dexterity = dexterity;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        @Override
        public String toString () {
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

        public enum typeClass {
            WARRIOR,
            CLERIC,
            MAGE,
            THIEF
        }


    }

