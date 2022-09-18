import java.util.Scanner;

public class game_time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hIn = scan.nextInt();
        int mIn = scan.nextInt();
        int hFim = scan.nextInt();
        int mFim = scan.nextInt();
        int totalH = hFim - hIn;
        int totalM = mFim - mIn;

        if (totalH < 0) {
            totalH = 24 + (hFim - hIn);
        }

        if (totalM < 0) {
            totalM = 60 + (mFim - mIn);
            totalH--;
        }

        if (hIn == hFim && mIn == mFim) System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        else System.out.println("O JOGO DUROU "+ totalH + " HORA(S) E " + totalM + " MINUTO(S)");
    }


}
