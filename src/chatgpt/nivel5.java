package chatgpt;

import java.util.Scanner;

public class nivel5 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        int x5 = sc.nextInt();

        int maior = x1;
        int menor = x1;

        if (x2 > maior){
            maior = x2; //maior valendo 49
        }
        if (x2 < menor) {
            menor = x2;
        }

        if (x3 > maior){
            maior = x3;
        }
        if (x3 < menor){
            menor = x3;
        }

        if (x4 > maior){
            maior = x4;
        }
        if (x4 < menor){
            menor = x4; // menor agora vale 0
        }

        if (x5 > maior){
            maior = x5;
        }
        if (x5 < menor){
            menor = x5;
        }

        System.out.println("Maior: "+ maior);
        System.out.println("Menor: "+ menor);

    }
}
