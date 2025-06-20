public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Shoes", "Fashion"),
            new Product(101, "Laptop", "Electronics"),
            new Product(110, "Watch", "Accessories"),
            new Product(102, "Phone", "Electronics")
        };

        int targetId = 110;

        // LINEAR SEARCH
        int indexLinear = LinearSearch.search(products, targetId);
        System.out.println("Linear Search:");
        if (indexLinear != -1)
            System.out.println("Product found at index " + indexLinear + ": " + products[indexLinear]);
        else
            System.out.println("Product not found.");

        // BINARY SEARCH (requires sorted array)
        BinarySearch.sortById(products);
        int indexBinary = BinarySearch.search(products, targetId);
        System.out.println("\nBinary Search:");
        if (indexBinary != -1)
            System.out.println("Product found at index " + indexBinary + ": " + products[indexBinary]);
        else
            System.out.println("Product not found.");
    }
}
