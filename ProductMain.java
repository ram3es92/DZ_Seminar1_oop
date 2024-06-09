import java.util.List;

import product.*;
import vendingMachine.*;


public class ProductMain {
    public static void main(String[] args) {
        // Создаем несколько горячих напитков
        HotDrink coffee = new HotDrink("Кофе", 250, 75);
        HotDrink tea = new HotDrink("Чай", 200, 80);
        HotDrink hotChocolate = new HotDrink("Горячий шоколад", 300, 85);

        // Создаем автомат для горячих напитков
        HotDrinkVM hotDrinkVendingMachine = new HotDrinkVM(null);
        hotDrinkVendingMachine.addProducts(List.of(coffee, tea, hotChocolate));

        // Получаем напиток из автомата
        HotDrink requestedDrink = hotDrinkVendingMachine.getProduct("Чай", 200, 80);
        System.out.println("Выдан " + requestedDrink);
    }
}