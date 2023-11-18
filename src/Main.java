import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = getinput();
        SortArray(num);
    }
    private static int[] getinput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int F = scanner.nextInt();

        if (F < 0) {
            System.out.println("Please enter a non-negative number.");
            System.exit(0);
        }

        int[] num = new int[F + 1];
        num[0] = F;

        for (int i = 1; i <= F; i++) {
            System.out.println("Enter number:");
            num[i] = scanner.nextInt();
        }

        return num;
    }
    private static void SortArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i <= array[0]; i++) {
            System.out.println(array[i]);
        }
    }
}
