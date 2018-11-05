/**
 * @version 1.0 05 ноября 2018 г.
 * @author  Natasha Yatcenya
 */
public final class Product {
    private String name;
    private int count;

    Product(final String productName, final int productCount) {
        this.name = productName;
        this.count = productCount;
    }

    String Name() {
        return name;
    }

     int Count() {
        return count;
    }
}