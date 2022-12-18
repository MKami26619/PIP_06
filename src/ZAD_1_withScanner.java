import java.util.Random;
import java.util.Scanner;

public class ZAD_1_withScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe elementow tablicy: ");
        int n = scanner.nextInt();

        int[] ZAKRES = createZAKRES(n);
        printZAKRES(ZAKRES);
    }

    public static int[] createZAKRES(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101);
        }

        return array;
    }

    public static void printZAKRES(int[] ZAKRES) {
        for (int i = 0; i < ZAKRES.length; i++) {
            System.out.print(ZAKRES[i] + " ");
        }
        System.out.println();
    }
}