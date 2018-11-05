/**
 * Сравнивает объекты класса Product по полю count
 * @version 1.0 05 ноября 2018 г.
 * @author  Natasha Yatcenya
 */
import java.util.Comparator;
public final class CountProduct implements Comparator<Product> {
    @Override
    public int compare(final Product o1, final Product o2) {
        if (o1.Count() > o2.Count()) {
            return 1;
        } else if (o1.Count() < o2.Count()) {
            return -1;
        } else {
            return 0;
        }
    }
}