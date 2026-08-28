package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        double pi = 3.14159;

        double resultado = (4.0 / 3) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f%n", resultado);

        sc.close();
    }
}
