import java.util.Scanner;

public class Map {
    public static char[][] matrix = new char[4][4];
    public String[] rows = new String[4];
    public char upDown = 3;
    public char leftRight = 2;
    public Scanner scanner;
    public String response;
    public char playerPos;
    public char potentialPos;
    public boolean validPathNorth;
    public boolean validPathSouth;
    public boolean validPathEast;
    public boolean validPathWest;

    public Map() {
        rows[0] = "00100";
        rows[1] = "00100";
        rows[2] = "01000";
        rows[3] = "00100";
        playerPos = matrix[upDown][leftRight];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = rows[row].charAt(col);
            }
        }
    }

    public void showMap() {
        System.out.println("MAP");
        for (String row : rows) {
            System.out.println(row);
        }

    }

    public void mapCheck() {
        playerPos = matrix[upDown][leftRight];

        char upPos = matrix[upDown + 1][leftRight];
        char downPos = matrix[upDown - 1][leftRight];
        char leftPos = matrix[upDown][leftRight - 1];
        char rightPos = matrix[upDown][leftRight + 1];




        //north
        if (upPos == '0') {
            validPathNorth = true;
            playerPos = upPos;
        }
        //south
        if (downPos == '0') {
            validPathSouth = true;
            playerPos = downPos;
        }
        //east
        if (leftPos == '0') {
            validPathWest = true;
            playerPos = leftPos;
        }
        //west
        if (rightPos == '0') {
            playerPos = rightPos;
            validPathNorth = true;
        }
    }


    public void playerPos() {

        System.out.println("Direction ?  (N,S,E,W");
        response = scanner.nextLine().toUpperCase();
        System.out.println(response);


    }


}//end class

