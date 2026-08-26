package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class b1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

                String name = sc.nextLine();
                double salarioFixo = sc.nextDouble();
                double totalVendas = sc.nextDouble();

                double comissão = totalVendas / 100 * 15;
                double salary = salarioFixo + comissão;

                System.out.printf("TOTAL = R$ %.2f%n", salary);

            }
        }