import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        InventoryManager manager = InventoryManager.getInstance();

        // New products
        manager.addProduct(new NewProduct("Laptop"));
        manager.addProduct(new NewProduct("Mobile"));

        // Legacy products via Adapter
        LegacyItem item1 = new LegacyItem(101, "Old Keyboard");
        LegacyItem item2 = new LegacyItem(102, "Old Mouse");

        manager.addProduct(new ProductAdapter(item1));
        manager.addProduct(new ProductAdapter(item2));

        // Iterator
        Iterator<Product> it = manager.returnInventory();

        System.out.println("---- Inventory ----");

        while (it.hasNext()) {
            it.next().displayDetails();
        }
    }
}