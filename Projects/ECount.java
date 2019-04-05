import java.text.MessageFormat;

public class ECount {
    public static void main(String[] args) {
        String s = "I love Bruce very much";
        int count = 1;
        count += 1;

         System.out.println(MessageFormat.format("{4}Number of E's in a string ", ++count));
    }
}
