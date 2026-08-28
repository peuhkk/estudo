package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        double total = x * y / 12.00;

        System.out.printf("%.3f%n",total);
    }
}
