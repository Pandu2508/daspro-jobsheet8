
import java.util.Scanner;

public class Triangle19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n = ");
            int n = sc.nextInt();
            int i;
            i = n;
            while (i >= 1) {
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i--;
            }
        }
    }
}
