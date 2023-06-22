import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Map {


    public String[][] design = new String[8][8];
    public int row = 7;
    public int col = 0;
    public Scanner scanner = new Scanner(System.in);
    public String response;
    public LineParser lineParser = new LineParser(response);

    public String playerPosition="1";
    public Boolean alive = true;

    public void createMap() {


        for (int row = 0; row < design.length; row++) {

            for (int col = 0; col < design.length; col++) {
                design[row][col] = "x";
            }
        }


        addTheRooms();
   //     playerPosition = design[7][0];  // TODO: 6/1/2023 remove
        System.out.println("Player position " + playerPosition);
    }

    private void addTheRooms() {
        design[7][0] = "1"; //hallway
        design[6][0] = "2"; //room 2
        design[5][0] = "3"; //kitchen
        design[5][1] = "4"; //Server room
        design[5][2] = "5"; //Lab
    }

    public void showMap() {
        //displays the map
        System.out.println("      MAP      ");

        for (int row = 0; row < design.length; row++) {
            System.out.println();
            for (int col = 0; col < design.length; col++) {
                System.out.print(design[row][col] + " ");
            }
        }

    }

    public void mapCheck() {


        System.out.println("Row " + row + " col " + col);


        if (Objects.equals(playerPosition, "1")) {
            hallway();


        }
        if (Objects.equals(playerPosition, "2")) {

            room2();
        }

        if (Objects.equals(playerPosition, "3")) {
            System.out.println("You are in a kitchen");
            System.out.println("Exits are : (E)ast and (S)outh");

        }
        if (Objects.equals(playerPosition, "4")) {
            System.out.println("You are in a Server room with blinking lights");
            System.out.println("Exits are : (W)est and (E)ast ");
        }

        if (Objects.equals(playerPosition, "5")) {
            System.out.println("You are in the Lab");
            System.out.println("Exits are : (W)est");
        }

    }

    private static void hallway() {
        System.out.println("you have entered a dark hallway the only exit is north");
        System.out.println("Exits are : (N)orth");

    }

    private void room2() {
        String[] words = getStrings();
        System.out.println("You are in a room with a chair and a small cupboard(room 2)");
        System.out.println("Exits are : (N)orth and (S)outh");
        System.out.println("Command ?");
        response = scanner.nextLine().toUpperCase();

        try {
            if (Objects.equals(words[0], "OPEN") && Objects.equals(words[1], "CUPBOARD")) {
                System.out.println("You open the cupboard. ");
                System.out.println("Inside the cupboard is a small blue keyCard");
                String blueKeyCard = "A small blue keyCard";
                System.out.println("What now >>");
                getStrings();
                inventoryAdd(blueKeyCard);

            }
        } catch (Exception e) {
            System.out.println("Open what?");
            System.out.println("Try again");
        }


    }

    private void inventoryAdd(String blueKeyCard) {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add(blueKeyCard);
    }

    private String[] getStrings() {
        lineParser.processWord(response);
        String[] words;
        words = response.split(" ");
        return words;
    }


    public void playerMove() {

        String redColor = "\u001b[31m";
        String blueColor = "\u001b[32m";
        String resetColor = "\u001b[0m";

        while (alive) {


            mapCheck();
            System.out.println(blueColor + "Command ? " + resetColor);
            response = scanner.nextLine().toUpperCase();
         //   System.out.println(response);
            lineParser.processWord(response);
            int testWater;
            switch (response) {
                case "N":
                    System.out.println("Going northward..");
                    testWater = row;
                    testWater--;

                    rowTest(testWater);
                    mapCheck();

                    break;


                case "S":
                    System.out.println("Going southward..");
                    testWater = row;
                    testWater++;

                    rowTest(testWater);

                    mapCheck();
                    break;

                case "E":
                    System.out.println("Going eastward..");
                    testWater = col;
                    testWater++;
                    colTest(testWater);
                    mapCheck();
                    break;

                case "W":
                    System.out.println("Going westward..");
                    testWater = col;
                    testWater--;
                    colTest(testWater);
                    mapCheck();

                    break;

            }
            System.out.println("Player char ::::::: " + playerPosition); // TODO: 6/2/2023 clear away

        }
    }

    private void rowTest(int testWater) {
        if (testWater >= 0 && testWater <= 7) {
            row = testWater;
            playerPosition = design[row][col];
            if (playerPosition == "x") {
                System.out.println("You cant go that way");
                row--;
                playerPosition = design[row][col];
            }
        } else
            System.out.println("You cant go that way");
    }

    private void colTest(int testWater) {
        if (testWater >= 0 && testWater <= 7) {
            col = testWater;
            playerPosition = design[row][col];
            if (playerPosition == "x") {
                System.out.println("You cant go that way");
                col--;
                playerPosition = design[row][col];
            }
        } else
            System.out.println("You cant go that way");
    }


}//end class




