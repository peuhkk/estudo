package beecrowd;

import java.util.Scanner;
import java.util.Locale;

public class b1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        int resultado;
        System.out.println("NOTAS:");

        resultado = (int) n / 100;
        System.out.println(resultado + " nota(s) de R$ 100.00");
        n = n % 100;
        resultado = (int) n / 50;
        System.out.println(resultado + " nota(s) de R$ 50.00");
        n = n % 50;
        resultado = (int) n / 20;
        System.out.println(resultado + " nota(s) de R$ 20.00");
        n = n % 20;
        resultado = (int) n / 10;
        System.out.println(resultado + " nota(s) de R$ 10.00");
        n = n % 10;
        resultado = (int) n / 5;
        System.out.println(resultado + " nota(s) de R$ 5.00");
        n = n % 5;
        resultado = (int) n / 2;
        System.out.println(resultado + " nota(s) de R$ 2.00");

        n = n % 2;
        n = n * 100;

        System.out.println("MOEDAS:");
        resultado = (int) n / 100;
        System.out.println(resultado + " moeda(s) de R$ 1.00");
        n = n % 100;
        resultado =  (int) n / 50;
        System.out.println(resultado + " moeda(s) de R$ 0.50");
        n = n % 50;
        resultado =  (int) n / 25;
        System.out.println(resultado + " moeda(s) de R$ 0.25");
        n = n % 25;
        resultado = (int) n / 10;
        System.out.println(resultado + " moeda(s) de R$ 0.10");
        n = n % 10;
        resultado = (int) n / 05;
        System.out.println(resultado + " moeda(s) de R$ 0.05");
        n = n % 5;
        resultado = (int)  n / 1;
        System.out.println(resultado + " moeda(s) de R$ 0.01");


        sc.close();

    }

}