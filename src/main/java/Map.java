import java.util.Scanner;

public class Map {


    public String[][] design = new String[8][8];
    public int row = 3;
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

    }

    private void addTheRooms() {
        design[7][0] = "1"; //hallway
        design[6][0] = "2"; //room 2
        design[5][0] = "3"; //kitchen
        design[5][1] = "4"; //Server room
    }

    public void showMap() {
        System.out.println("      MAP      ");

        for (int row = 0; row < design.length; row++) {
            System.out.println();
            for (int col = 0; col < design.length; col++) {
                System.out.print(design[row][col] + " ");
            }
            addTheRooms();
        }

    }

    public void mapCheck() {

        System.out.println("Row " + row + " col " + col);

        if ((row >= 0) && (row <= design.length)) {

            System.out.println("You enter the building. The only door is north.... ");

            if (row == 3 && col == 0) {
                System.out.println("you have entered a dark hallway");
                System.out.println("Exits are : North");
            }
            if (row == 2 && col == 0) {
                System.out.println("You are in a room with a chair and a small cupboard(room 2)");
                System.out.println("Exits are : North and South");
            }

            if (row == 1 && col == 0) {
                System.out.println("You are in a kitchen");
                System.out.println("Exits are : East and South");
            }
            if (row == 1 && col == 1) {
                System.out.println("You are in a Server room with blinking lights");
                System.out.println("Exits are : West and North ");
            }


        }//end of func


    }


    public void playerMove() {

        while (alive) {

            System.out.println("Direction ?  (N,S,E,W)");
            response = scanner.nextLine().toUpperCase();
            System.out.println(response);
            switch (response) {
                case "N":
                    row++;
                    validiateGridPosition();
                    break;
                case "S":
                    row--;
                    validiateGridPosition();
                    break;
                case "E":
                    col++;
                    validiateGridPosition();
                    break;
                case "W":
                    col--;
                    validiateGridPosition();
                    break;

            }
            mapCheck();
        }
    }

    private void validiateGridPosition() {

        playerPosition = design[row][col];
    }


}//end class

