/**
 * Сравнивает объекты класса Product по полю name
 * @version 1.0 05 ноября 2018 г.
 * @author  Natasha Yatcenya
 */
import java.util.Comparator;
public class NameProduct implements Comparator<Product> {
    public int compare(final Product o1, final Product o2) {
        return o1.Name().compareTo(o1.Name());
    }
}