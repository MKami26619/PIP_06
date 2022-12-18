import java.util.Random;

public class ZAD_1_withN {
    public static void main(String[] args) {
        int[] ZAKRES = createZAKRES(10);
        printZAKRES(ZAKRES);
    }

    public static int[] createZAKRES(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public static void printZAKRES(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}