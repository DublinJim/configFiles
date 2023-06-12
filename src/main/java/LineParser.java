public class LineParser {


    public Inventory inventory = new Inventory();
    public Map map;
    public String response;

    public LineParser(String response) {
        this.response = response;


    }



    public void processWord(String response) {
        map = new Map();

        switch (response) {
            case "INV":
            case "INVENTORY":

                inventory.showInventory();
                break;
            case "LOOK":
            case "L":

                map.mapCheck();
                System.out.println("LOOKING");
                break;

            case "TAKE":
            case "T":
                System.out.println("You take the ");

        }
    }

}

