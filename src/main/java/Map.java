public class Map {
    public static char[][] matrix = new char[4][4];
    public String[] rows = new String[4];


    public Map() {
        rows[0] = "00100";
        rows[1] = "00100";
        rows[2] = "01000";
        rows[3] = "00100";

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




}//end class

