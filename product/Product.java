package product;

public class Product {
    private String name;
    private int volume;

    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return "Напиток: " + name + ", Объём: " + volume;
    }
}
