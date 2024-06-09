package vendingMachine;

import java.util.ArrayList;
import java.util.List;

import product.HotDrink;
import product.Product;


public class HotDrinkVM extends VendingMachine {
    private List<HotDrink> hotDrinks = new ArrayList<>();

    public HotDrinkVM(List<Product> products) {
        super(products);
    }

    public void addProduct(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    @Override
    public void addProducts(List<Product> products) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                hotDrinks.add((HotDrink) product);
            }
        }
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(name)) {
                return hotDrink;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }
}