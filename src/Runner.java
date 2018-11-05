/**
 * @version 1.0 05 ноября 2018 г.
 * @author  Natasha Yatcenya
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * *  Реализация интерфейса Comparator
 */
public class Runner {
    public static void main(final String[] args) {
        Comparator<Product> pr = new CountProduct().thenComparing(new NameProduct());
        Set<Product> products = new TreeSet<>(pr);
        products.add(new Product("Юбка", 3));
        products.add(new Product("Джинсы", 6));
        products.add(new Product("Футболка", 11));
        for (Product s : products) {
            System.out.println(s.Name() +" "+s.Count());
        }
    }

}

