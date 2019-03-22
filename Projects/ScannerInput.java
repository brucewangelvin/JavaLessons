/*Create a program which allows a user to insert ten numbers into an array through the console.*/

import java.util.Scanner;
import java.util.Arrays;

public class ScannerInput {
    public static void main(String[] args) {

      int sum=0;
     Scanner sc=new Scanner(System.in);
     for(int i=1;i<=10;i++){
         System.out.print(i+"-Enter Number:");
         int c=sc.nextInt();
     }
    System.out.println("Sum of all the entered 10 numbers is:"+sum);
     sc.close();

    }
}
