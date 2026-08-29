package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1019 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int horas = n / 3600;
        n = n % 3600;
        int minutos = n / 60;
        n = n % 60;
        int segundos = n;

        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
