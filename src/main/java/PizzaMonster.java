import java.io.IOException;

public class PizzaMonster extends Player {
    public Player player;


    public PizzaMonster(Player player) throws IOException {
        this.player = player;
        System.out.println("Pizza Monster appears .....");
        randomFactors();

    }
public void battleStats(){
        Main.clearScreen();
    System.out.print("PIZZA MONSTER ----------- "+player.name+"\n");
    System.out.print("--------------          ----------------\n");
    System.out.print("Strength "+strength+" --------- Strength "+ player.strength+"\n");

}
    @Override
    public String toString() {
        return "PizzaMonster{" +
                "strength=" + strength +
                ", awareness=" + awareness +
                ", dexterity=" + dexterity +
                "} " + super.toString();
    }

    public void battlePizzaMonster() {
        System.out.println("A Pizza Monster stand in your path....");

    }
}
