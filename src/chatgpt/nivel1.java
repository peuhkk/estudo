package chatgpt;

import java.util.Scanner;

public class nivel1 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x > 0){
            System.out.println(x+ " é positivo");
        } else if (x < 0) {
            System.out.println(x + " é negativo");
        } else if (x == 0) {
            System.out.println("é igual a 0");
        }

    }
}
