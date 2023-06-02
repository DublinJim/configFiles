import java.util.Objects;
import java.util.Scanner;

public class Map {


    public String[][] design = new String[8][8];
    public int row = 7;
    public int col = 0;
    public Scanner scanner = new Scanner(System.in);
    public String response;
    public String playerPosition;
    public Boolean alive = true;
    public boolean validPathNorth = false;
    public boolean validPathSouth = false;
    public boolean validPathEast = false;
    public boolean validPathWest = false;

    public Map() {


        for (int row = 0; row < design.length; row++) {

            for (int col = 0; col < design.length; col++) {
                design[row][col] = "x";
            }
        }


        addTheRooms();
        playerPosition = design[7][0];  // TODO: 6/1/2023 remove
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
            System.out.println("you have entered a dark hallway the only exit is north");
            System.out.println("Exits are : North");
        }
        if (Objects.equals(playerPosition, "2")) {
            System.out.println("You are in a room with a chair and a small cupboard(room 2)");
            System.out.println("Exits are : North and South");
        }

        if (Objects.equals(playerPosition, "3")) {
            System.out.println("You are in a kitchen");
            System.out.println("Exits are : East and South");
        }
        if (Objects.equals(playerPosition, "4")) {
            System.out.println("You are in a Server room with blinking lights");
            System.out.println("Exits are : West and East ");
        }

        if (Objects.equals(playerPosition, "5")) {
            System.out.println("You ar in the Lab");
            System.out.println("Exits are : West ");
        }
    }


    public void playerMove() {
        System.out.println("You are in the ADGA building ");

        while (alive) {

            System.out.println("Direction ?  (N,S,E,W)");
            response = scanner.nextLine().toUpperCase();
            System.out.println(response);
            int testWater;
            switch (response) {
                case "N":
                    testWater = row;
                    testWater--;

                    rowTest(testWater);


                    if (Objects.equals(playerPosition, "x") || (playerPosition == null)) {
                        System.out.println("You cant go that way");
                        row++;
                    }
                    break;


                case "S":
                    testWater = row;
                    testWater++;

                    rowTest(testWater);

                    if (Objects.equals(playerPosition, "x") || (playerPosition == null)) {
                        System.out.println("You cant go that way");
                        row--;
                    }
                    break;
                case "E":
                    testWater = col;
                    testWater++;
                    colTest(testWater);

                    if (Objects.equals(playerPosition, "x") || (playerPosition == null)) {
                        System.out.println("You cant go that way");
                        col--;
                    }
                    break;
                case "W":
                    testWater = col;
                    testWater--;
                    colTest(testWater);

                    if (Objects.equals(playerPosition, "x") || (playerPosition == null)) {
                        System.out.println("You cant go that way");
                        col++;
                    }
                    break;

            }
            System.out.println("Player char :::::::" + playerPosition); // TODO: 6/2/2023 clear away
            mapCheck();
        }
    }

    private void rowTest(int testWater) {
        if (testWater >= 0 && testWater <= 7) {
            row = testWater;
            playerPosition = design[row][col];
        }
    }

    private void colTest(int testWater) {
        if (testWater >= 0 && testWater <= 7) {
            col = testWater;
            playerPosition = design[row][col];
        }
    }


}//end class




