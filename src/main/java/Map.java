import java.util.Scanner;

public class Map {
    public static int[][] matrix = new int[4][4];

    public int row = 3;
    public int col = 0;
    public Scanner scanner = new Scanner(System.in);
    public String response;

    public Boolean alive = true;
    public boolean validPathNorth = false;
    public boolean validPathSouth = false;
    public boolean validPathEast = false;
    public boolean validPathWest = false;

    public Map() {

        System.out.println("Map starts at " + matrix[0][3]);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = 1;
            }
        }
        matrix[0][3] = 0;//enter
        matrix[3][0] = 0; //hallway
        matrix[2][0] = 0; //room 2
        matrix[1][0] = 0; //kitchen
        matrix[1][1] = 0; //Server room
    }

    public void showMap() {
        System.out.println("MAP");

        for (int col = 0; col < matrix.length; col++) {
            System.out.println();
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[row][col]);
            }

        }

    }

    public void mapCheck() {

        System.out.println("Row " + row + " col " + col);

        if ((row >= 0) && (row <= matrix.length)) {

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
                    valdateGridPosition();
                    break;
                case "S":
                    row--;
                    valdateGridPosition();
                    break;
                case "E":
                    col++;
                    valdateGridPosition();
                    break;
                case "W":
                    col--;
                    valdateGridPosition();
                    break;

            }
            mapCheck();
        }
    }

    private void valdateGridPosition() {
        if (row > matrix.length) {
            row--;
            System.out.println("You cant go that way");
        } else if (row < 0) {
            row++;
            System.out.println("You cant go that way");
        }

        if (col > matrix.length) {
            col--;
            System.out.println("You cant go that way");
        } else if (col < 0) {
            col++;
            System.out.println("You cant go that way");
        }
    }


}//end class

