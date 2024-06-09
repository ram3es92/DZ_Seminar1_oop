package vendingMachine;

import java.util.ArrayList;
import java.util.List;

import product.HotDrink;
import product.Product;

public abstract class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public abstract void addProducts (List<Product> products);

    public Product getProduct(String name) {

//        products.stream().filter(product -> product.getName().equals(name)).findFirst().orElse(null);

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("Product ne naiden: " + name);
        return null;
    }



//    public Product getProduct(String name) {
//
//        for (Product product : products) {
//            if (product.getName().equals(name)) {
//                products.remove(product);
//                return product;
//            }
//        }
//
//        throw new RuntimeException("No such product: " + name);
//    }

    public List<Product> getProducts() {
        return products;
    }

    public HotDrink getProduct(String string, int i, int j) {
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }
}