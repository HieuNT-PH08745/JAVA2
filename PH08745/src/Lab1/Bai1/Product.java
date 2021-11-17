package Lab1.Bai1;

import Lab1.Bai4.DAO;

/**
 *
 * @author os_cntt_gpdn25
 */
public class Product implements DAO {
    private String name;
    
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getImportTax() {
        return 0.1 * this.price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", tax=" + getImportTax() + '}';
    }

    @Override
    public void insert() {
        System.out.println("Insert success");
    }

    @Override
    public void update() {
        System.out.println("Update success");
    }

    @Override
    public void delete() {
        System.out.println("Delete success");
    }

    @Override
    public void select() {
        System.out.println("Select success");
    }

    
    
}
