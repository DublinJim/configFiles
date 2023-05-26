import java.io.IOException;

public class PizzaMonster extends Player {
    public Player player;


    public PizzaMonster(Player player) throws IOException {
        this.player = player;
        System.out.println("Pizza Monster appears .....");
        randomFactors();

    }

    @Override
    public String toString() {
        return "PizzaMonster{" +
                ", strength=" + strength +
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

    public void battlePizzaMonster() {
        System.out.println("A Pizza Monster stand in your path....");

    }
}
