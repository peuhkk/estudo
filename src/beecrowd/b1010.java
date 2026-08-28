package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int n1 = sc.nextInt();
        double valorUni1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int n2 = sc.nextInt();
        double valorUni2 = sc.nextDouble();

        double total = (valorUni1 * n1) + (valorUni2 * n2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
