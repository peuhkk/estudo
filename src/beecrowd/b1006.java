package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double media = ((n1 * 2 ) + (n2 * 3) + (n3 * 5)) / 10;

        System.out.println("MEDIA = "+ media);

    }
}
