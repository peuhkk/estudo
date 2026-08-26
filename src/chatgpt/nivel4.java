package chatgpt;

import java.util.Scanner;

public class nivel4 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        if (x1 > x2 && x1 > x3){
            System.out.println("O maior número é: " + x1);
        } else if (x2 > x1 && x2 > x3) {
            System.out.println("O Maior número é: " + x2);
        } else {
            System.out.println("O Maior número é: " + x3);
        }
    }
}
