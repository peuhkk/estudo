package chatgpt;

import java.util.Scanner;

public class nivel2 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println(x + " é par!");
        } else {
            System.out.println(x +" é impar!");
        }

    }
}
