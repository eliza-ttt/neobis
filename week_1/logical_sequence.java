import java.io.IOException;
import java.util.Scanner;

public class logical_sequence {

public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int cont = 1;
        for (int i = 1; i <= Y; i++) {
        System.out.print(i);
        if (i % X == 0) System.out.println("");
        else System.out.print(" ");

        }
        }

}