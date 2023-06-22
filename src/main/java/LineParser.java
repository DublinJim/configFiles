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
            case "I":

                inventory.showInventory();
                break;
            case "LOOK":
            case "L":

                System.out.println("LOOKING");
                map.mapCheck();

                break;

            case "TAKE":
            case "T":
                System.out.println("You take the ");

        }
    }

}

