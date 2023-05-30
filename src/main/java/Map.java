import java.util.Scanner;

public class Map {
    public static int[][] matrix = new int[4][4];
    public String[] rows = new String[4];
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
        rows[0] = "00100";
        rows[1] = "00100";
        rows[2] = "01000";
        rows[3] = "00400";
        System.out.println("Map starts at "+matrix[0][2]);


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {


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


        if (((upDown ++) >= 0) && (upDown > matrix.length)){

            if (upDown==3 && leftRight==1){
                System.out.println("you have entered a dark hallway");
            }
        }




    }


    public void playerMove() {

        System.out.println("Direction ?  (N,S,E,W)");
        response = scanner.nextLine().toUpperCase();
        System.out.println(response);
        switch (response){
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

