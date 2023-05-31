import java.util.Scanner;

public class Map {
    public static int[][] matrix = new int[4][4];

    public int upDown = 3;
    public int leftRight = 0;
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
        matrix[0][3] = 0;
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

        System.out.println("Row "+ upDown+ " col "+leftRight);

        if ((upDown >= 0) && (upDown <= matrix.length)) {

            System.out.println("You enter the building. The only door is north.... ");
            if (upDown == 3 && leftRight == 0) {
                System.out.println("you have entered a dark hallway");
                System.out.println("Exits are : North");
            }
            if (upDown == 2 && leftRight == 0) {
                System.out.println("You are in a room with a chair and a small cupboard(room 2)");
                System.out.println("Exits are : North and South");
            }

            if (upDown == 1 && leftRight == 0) {
                System.out.println("You are in a kitchen");
                System.out.println("Exits are : East and South");
            }
            if (upDown == 1 && leftRight == 1) {
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
                    upDown++;
                    break;
                case "S":
                    upDown--;
                    break;
                case "E":
                    leftRight++;
                    break;
                case "W":
                    leftRight--;
                    break;

            }
            mapCheck();
        }
    }


}//end class

