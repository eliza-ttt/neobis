import java.io.IOException;
import java.util.Scanner;

public class population_incr {

        public static void main(String[] args) throws IOException {
                Scanner scan = new Scanner(System.in);
                int T = scan.nextInt();
                int PA, PB, anos;
                double G1, G2;
                for (int i = 1; i <= T; i++) {
                        anos = 0;
                        PA = scan.nextInt();
                        PB = scan.nextInt();
                        G1 = scan.nextDouble();
                        G2 = scan.nextDouble();
                        while (PB >= PA) {
                                PA += (PA * G1) / 100;
                                PB += (PB * G2) / 100;
                                anos++;
                                if (anos > 100) {
                                        break;
                                }
                        }
                        if (anos > 100) {
                                System.out.println("Mais de 1 seculo.");
                        } else {
                                System.out.println(anos + " anos");
                        }
                }
        }

}