package Lab1.Bai3;

import Lab1.Bai1.Product;

/**
 *
 * @author os_cntt_gpdn25
 */
public class NoTaxProduct extends Product {    

    public NoTaxProduct() {
    }

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }
    
    @Override
    public double getImportTax() {
        return 0;
    }
    
}
