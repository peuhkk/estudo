package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int PROD = n1 * n2;

        System.out.println("PROD = "+ PROD);

    }
}
