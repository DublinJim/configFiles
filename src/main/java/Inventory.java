import java.util.ArrayList;

public class Inventory {

    public String item;

    public ArrayList<String> inventory = new ArrayList<>();


    public Inventory() {

        item= "Compass";
        inventory.add(item);
    }

    public void inventoryAdd() {
        inventory.add(item);
    }



    public void showInventory() {
        System.out.println("You have ......\n");
        int numItems = inventory.size();
        for (String s : inventory) {
            System.out.println(numItems + ": " + s);
        }
    }
}


