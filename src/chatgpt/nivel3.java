package chatgpt;

import java.util.Scanner;

public class nivel3 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();

        if (x1 > x2){
            System.out.println("O maior número é: " + x1);
        } else {
            System.out.println("O maior número é: " + x2);
        }

    }
}
