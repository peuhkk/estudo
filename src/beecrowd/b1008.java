package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int hT = sc.nextInt();
        double vR = sc.nextDouble();

        double salary = vR * hT;

        System.out.println("NUMBER = "+ n1);
        System.out.printf("SALARY = U$ %.2f%n", salary);

    }
}
