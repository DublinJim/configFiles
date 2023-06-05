import java.util.ArrayList;
import java.util.Objects;

public class LineParser {

public ArrayList<String> parserWords = new ArrayList<>();

String response;

    public LineParser(String response) {
        this.response = response;
        parserWords.add("LOOK");
        parserWords.add("UNLOCK");
        parserWords.add("TAKE");
    }

public void addWordToArray(String newWords){
        parserWords.add(newWords);

}

    public void processWord(String response) {
        for (int i = 0; i <parserWords.size() ; i++) {
           // System.out.println(parserWords.get(i));
            String wordIn=parserWords.get(i);
            if (Objects.equals(response, wordIn)) {
                System.out.println("Match");
            }
        }
    }
}
