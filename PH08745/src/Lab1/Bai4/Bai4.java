package Lab1.Bai4;

import Lab1.Bai1.Product;
import Lab1.Bai3.NoTaxProduct;

/**
 *
 * @author os_cntt_gpdn25
 */
public class Bai4 {

    public static void main(String[] args) {
        Product proTax = new Product("a", 100);
        Product proNoTax = new NoTaxProduct("b", 200);

        System.out.println(proTax.toString());
        proTax.insert();
        
        System.out.println(proNoTax.toString());
        proNoTax.insert();
    }
}
