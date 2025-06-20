import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static int search(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId)
                return mid;
            else if (products[mid].productId < targetId)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void sortById(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
    }
}
