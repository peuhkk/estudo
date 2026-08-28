package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1018 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n);
        int nota100 = n / 100;
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        n = n % 100;
        int nota50 = n / 50;
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        n = n % 50;
        int nota20 = n / 20;
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        n = n % 20;
        int nota10 = n / 10;
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        n = n % 10;
        int nota5 = n / 5;
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        n = n % 5;
        int nota2 = n / 2;
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        n = n % 2;
        int nota1 = n /1;
        System.out.println(nota1 + " nota(s) de R$ 1,00");

    }
}
