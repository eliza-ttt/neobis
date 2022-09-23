import java.io.IOException;
import java.util.Scanner;

public class URI1182 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        double soma = 0;
        char T = scan.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = scan.nextDouble();
            }
        }

        for (double[] doubles : M) {
            soma += doubles[C];
        }

        if (T == 'M') soma /= M.length;
        System.out.printf("%.1f%n", soma);
        }

}