import java.util.ArrayList;

public class Inventory {

    public String item;

    public ArrayList<String> inventory = new ArrayList<>();


    public Inventory(String item) {
        this.item = item;
    }

    public void inventoryAdd() {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add(item);
    }

    public void inventoryShow() {
        System.out.println("You have ......\n");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }

    }
}


