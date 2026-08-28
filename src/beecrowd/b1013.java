package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class b1013 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorAC = (a + c + Math.abs(a - c)) / 2;

       if (maiorAB > maiorAC){
           System.out.println(maiorAB + " eh o maior");
       } else {
           System.out.println(maiorAC + " eh o maior");
       }

    }
}
