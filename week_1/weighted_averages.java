import java.util.Scanner;

public class weighted_averages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            double n1 = scan.nextDouble();
            double n2 = scan.nextDouble();
            double n3 = scan.nextDouble();
            double media = ((n1*2) + (n2*3) + (n3*5)) / 10;
            System.out.printf("%.1f%n", media);
        }
    }

}
