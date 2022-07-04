import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int power0f4, power0f5;
        Scanner sum = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sum.nextInt();

        power0f4 = 0;
        for (int i = 1; i < n; i *= 4) {

            System.out.println("4^:" + power0f4+":" + i);
            power0f4++;
        }
        System.out.println("----------------");

         power0f5 =0;
        for (int i = 1; i < n; i *= 5) {

            System.out.println("5^:" + power0f5+ ":" + i);
            power0f5++;


        }

    }
}