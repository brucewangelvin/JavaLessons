import java.util.Arrays;
public class ArrayProblemLetters {
        public static void main(String[] args) {
            char[] letters = {'z','e','f','j','a','o','l','k','t'};
            char[] realLetters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

            char data[] = new char[letters.length];
            int x = 0;

            for (int j = 0; j < realLetters.length; j++){
                for (int i = 0; i < letters.length; i++){
                    if (letters[i]==realLetters[j]) {
                        data[x]=letters[i];
                        x+=1;
                    }

                }

            }

            System.out.println(Arrays.toString(data));

        }
    }

