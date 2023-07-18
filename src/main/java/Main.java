import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//load the classes into objects
        SaveAndLoad saveAndLoad = new SaveAndLoad(new ConfigMaker());
        Map map = new Map();
        Player player = saveAndLoad.getPlayer();

        String redColor = "\u001b[31m";
        String blueColor = "\u001b[32m";
        String resetColor = "\u001b[0m";


        System.out.println("Config demo");

        System.out.println("\n" +
                "                                                  \n" +
                "                 ,----..                     ,--. \n" +
                "    ,---,       /   /   \\  ,-.----.      ,--/  /| \n" +
                "  .'  .' `\\    /   .     : \\    /  \\  ,---,': / ' \n" +
                ",---.'     \\  .   /   ;.  \\;   :    \\ :   : '/ /  \n" +
                "|   |  .`\\  |.   ;   /  ` ;|   | .\\ : |   '   ,   \n" +
                ":   : |  '  |;   |  ; \\ ; |.   : |: | '   |  /    \n" +
                "|   ' '  ;  :|   :  | ; | '|   |  \\ : |   ;  ;    \n" +
                "'   | ;  .  |.   |  ' ' ' :|   : .  / :   '   \\   \n" +
                "|   | :  |  ''   ;  \\; /  |;   | |  \\ |   |    '  \n" +
                "'   : | /  ;  \\   \\  ',  / |   | ;\\  \\'   : |.  \\ \n" +
                "|   | '` ,/    ;   :    /  :   ' | \\.'|   | '_\\.' \n" +
                ";   :  .'       \\   \\ .'   :   : :-'  '   : |     \n" +
                "|   ,.'          `---`     |   |.'    ;   |,'     \n" +
                "'---'                      `---'      '---'       \n" +
                "                                                  \n  \n  ");

        System.out.println("An ADGA adventure");
        System.out.println("By J. Keogh\n\n");
        saveAndLoad.askForContinue(saveAndLoad);
        map.createMap();
        map.showMap();
        System.out.println(redColor + "\n\n--Begin the adventure--" + resetColor);
        System.out.println("You enter the ADGA building");
        System.out.println();
        System.out.println("A door slams behind you");
        map.playerMove();
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}// end class
