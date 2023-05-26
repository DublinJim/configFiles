import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        ConfigMaker configMaker = new ConfigMaker();
        SaveAndLoad saveAndLoad = new SaveAndLoad(configMaker);

        System.out.println("Config demo");

        saveAndLoad.askForContinue(saveAndLoad);
        Player player = saveAndLoad.getPlayer();
        System.out.println(" NEW PLAYER __________________________ \n" + player);
        System.out.println("back to main");

        PizzaMonster pizzaMonster = new PizzaMonster(player);
        pizzaMonster.battlePizzaMonster();
        System.out.println(pizzaMonster);
    }


}
