package Lab1.Bai3;

import Lab1.Bai1.Product;
import java.util.Scanner;

/**
 *
 * @author os_cntt_gpdn25
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Product pro = new NoTaxProduct();
        
        System.out.print("Nhap ten sp: ");
        pro.setName(sc.next());
        
        System.out.print("Nhap gia sp: ");
        pro.setPrice(sc.nextDouble());
        
        System.out.println("----------------");
        System.out.println(pro.toString());
    }
}
