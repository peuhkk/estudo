import java.util.Scanner;

public class test {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String[] pecas = new String[2];
        double[] precoPecas = new double[2];
        int[] idPecas = new int[2];

        System.out.println("Cadastre a peça: ");
        System.out.println("===============");

        for (int a = 0; a < 2; a++){
            System.out.println("Digite o nome da peça: ");
            pecas[a] = sc.nextLine();;
            System.out.println("Digite o preço da peça: ");
            precoPecas[a] = sc.nextDouble();
            System.out.println("Digite o ID da peça");
            idPecas[a] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Peças: ");
        for (int b = 0; b < 2; b++){
            System.out.println("ID: "+ idPecas[b]);
            System.out.println("Nome: " + pecas[b]);
            System.out.printf("Preço: R$ %.2f%n", precoPecas[b]);
        }


    }
}
