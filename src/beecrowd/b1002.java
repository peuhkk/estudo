package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * Math.pow(n, 2);

        System.out.printf("A=%.4f%n", area);

    }
}