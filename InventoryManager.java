import java.util.*;

public class InventoryManager {

    private static InventoryManager instance;
    private List<Product> products;

    private InventoryManager() {
        products = new ArrayList<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public Iterator<Product> returnInventory() {
        return products.iterator();
    }
}