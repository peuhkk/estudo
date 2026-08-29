package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1020 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int ano = x / 365;
        x = x % 365;
        int mes = x / 30;
        x = x % 30;
        int dia = x;

        System.out.println(ano +" ano(s)");
        System.out.println(mes +" mes(es)");
        System.out.println(dia +" dia(s)");

    }
}
