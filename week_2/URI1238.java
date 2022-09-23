
import java.util.Scanner;

public class URI1238 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int N = leitor.nextInt();
            for (int i = 0; i < N; i++) {
                String string1 = leitor.next();
                String string2 = leitor.next();
                String maior, menor;
                String resultado = "";
                if (string1.length() > string2.length()) {
                    maior = string1;
                    menor = string2;
                } else {
                    maior = string2;
                    menor = string1;
                }
                for (int j = 0; j < menor.length(); j++) {
                    resultado += string1.charAt(j) + "" + string2.charAt(j);
                }
                resultado += maior.substring(menor.length(), maior.length());
                System.out.println(resultado);
            }
        }

}