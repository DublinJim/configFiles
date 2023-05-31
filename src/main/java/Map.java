import java.util.Scanner;

public class Map {
    public static int[][] matrix = new int[4][4];

    public int upDown = 3;
    public int leftRight = 2;
    public Scanner scanner = new Scanner(System.in);
    public String response;
    public int playerPos;
    public int potentialPos;
    public boolean validPathNorth = false;
    public boolean validPathSouth = false;
    public boolean validPathEast = false;
    public boolean validPathWest = false;

    public Map() {

        System.out.println("Map starts at " + matrix[0][2]);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[col][row] = 1;
            }
        }
        matrix[0][3] = 9;
    }

    public void showMap() {
        System.out.println("MAP");

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println("\n");
        }

    }

    public void mapCheck() {


        if ((upDown >= 0) && (upDown <= matrix.length)) {
            System.out.println("At "+matrix[0][3]);
            if (upDown == 0 && leftRight == 3) {
                System.out.println("you have entered a dark hallway");
                System.out.println("Exits are : North");
            }
            if (upDown == 0 && leftRight == 2) {
                System.out.println("You are in a room with a chair and a small cupboard");
                System.out.println("Exits are : North");
            }
        }


    }


    public void playerMove() {

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
        }
        mapCheck();
    }


}//end class

