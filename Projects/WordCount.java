import java.text.MessageFormat;

public class WordCount {

    public static void main(String[] args) {

        String s = "I love Bruce very much";
      int count = 1;
        count += 1;

        System.out.println(MessageFormat.format("{6}Number of words in a string ", ++count));
    }
}