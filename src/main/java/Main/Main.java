/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Main;

import Entidades.ImportedProduct;
import Entidades.Product;
import Entidades.UsedProducts;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Quantos produtos deseja adicionar: ");
        int nprodutos = sc.nextInt();

        for (int i = 0; i < nprodutos; i++) {
            System.out.println("O pruduto " + (i+1) + " é comum = c, usado = u ou importado = i?");
            char ca = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ca == 'c') {
                list.add(new Product(name, price));
            } else if (ca == 'u') {
                System.out.print("manufactureDate: ");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProducts(name, price, manufactureDate));

            } else if (ca == 'i') {
                System.out.print("customsfee: ");
                double customsfee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsfee));

            } else {
                System.out.println("invalido");
            }
        }
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
