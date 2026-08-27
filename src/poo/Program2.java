package poo;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        p.Name = sc.nextLine();
        System.out.println("Price: ");
        p.Price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        p.Quantity = sc.nextInt();

        System.out.println("Product data: "+ p.Name + " $ "
                + p.Price +", " + p.Quantity +" units, Total: $ " + p.TotalValueInStock() );

        System.out.println("Enter the number of products to be added in stock: ");
        p.AddProducts(sc.nextInt());

        System.out.println("Product data: "+ p.Name + " $ "
                + p.Price +", " + p.Quantity +" units, Total: $ " + p.TotalValueInStock() );

        System.out.println("Enter the number of products to be removed from stock: ");
        p.RemoveProducts(sc.nextInt());

        System.out.println("Product data: "+ p.Name + " $ "
                + p.Price +", " + p.Quantity +" units, Total: $ " + p.TotalValueInStock() );

    }
}
