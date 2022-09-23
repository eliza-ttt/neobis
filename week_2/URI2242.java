import java.util.Scanner;

public class URI2242 {

    public static final String VOGAIS = "aeiou";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuilder aux = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (VOGAIS.contains(ch+"")) {
                aux.append(ch);
            }
        }

        int end = aux.length()-1;
        boolean isFunny = true;

        for (int i = 0; i < aux.length() / 2; i++) {
            if (aux.charAt(i) != aux.charAt(end)) {
                isFunny = false;
                break;
            }
            end--;
        }

        System.out.println(isFunny ? "S" : "N");

        sc.close();
    }
}
