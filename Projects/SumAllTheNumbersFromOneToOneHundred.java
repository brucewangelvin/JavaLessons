/* Sum up all of the numbers from one to one hundred (1 + 2 + 3 + ... + 98 + 99 + 100) & print out the result. The answer is 5050. */

public class SumAllTheNumbersFromOneToOneHundred {
    public static void main(String[] args) {
      int n = 100;
      int sum = 0;

      for (int i = 0; i <= n; i++) {
        sum = sum + i;
      }
     System.out.println(sum);


    }
}