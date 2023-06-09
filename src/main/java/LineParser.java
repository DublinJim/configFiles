import java.util.ArrayList;

public class LineParser {

    public ArrayList<String> parserWords = new ArrayList<>();
    public Inventory inventory = new Inventory();

    String response;

    public LineParser(String response) {
        this.response = response;
        parserWords.add("LOOK");
        parserWords.add("UNLOCK");
        parserWords.add("TAKE");
        parserWords.add("CUPBOARD");
    }

    public void addWordToArray(String newWords) {
        parserWords.add(newWords);

    }

    public void processWord(String response) {


        switch (response) {
            case "INV":
            case "INVENTORY":

                inventory.showInventory();
                break;
            case "LOOK":
            case "L":
                Map map = new Map();
                map.mapCheck();
                System.out.println("LOOKING");
                break;
        }
    }

}

