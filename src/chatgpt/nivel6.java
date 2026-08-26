package chatgpt;

import java.util.Scanner;

public class nivel6 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro Número: ");
        int x1 = sc.nextInt();
        System.out.println("Segundo Número: ");
        int x2 = sc.nextInt();
        System.out.println("Operação: ");
        String op = sc.next();

        if (op.equals("+")){
            System.out.println("Soma = " + (x1 + x2));
        }
        if (op.equals("-")){
            System.out.println("Subtração = " + (x1 - x2));
        }
        if (op.equals("/")){
            System.out.println("Divisão = " + (x1 / x2));
        }
        if (op.equals("*")){
            System.out.println("Multiplicação = " + (x1 * x2));
        }
        if (op.equals("%")){
            System.out.println("Resto = " + (x1 % x2));
        }

    }
}
