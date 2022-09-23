import java.util.Scanner;

public class URI1176 {
        public static void main(String[] args) {
                Scanner leitor = new Scanner(System.in);
                int T = leitor.nextInt();
                for (int j = 0; j < T; j++) {
                                int N = leitor.nextInt();
                        long anterior = 0, atual = 1, proximo;
                                for (int i=0; i < N; i++) {
                                        proximo = anterior + atual;
                                        anterior = atual;
                                        atual = proximo;
                                }
                                System.out.println("Fib("+ N +") = " + anterior);
                }
        }

}