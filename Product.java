interface Product {
    void displayDetails();
}

// Legacy class
class LegacyItem {
    private int itemId;
    private String description;

    public LegacyItem(int itemId, String description) {
        this.itemId = itemId;
        this.description = description;
    }

    public void print() {
        System.out.println("Legacy Item -> ID: " + itemId + ", Desc: " + description);
    }
}

// Adapter
class ProductAdapter implements Product {
    private LegacyItem legacyItem;

    public ProductAdapter(LegacyItem legacyItem) {
        this.legacyItem = legacyItem;
    }

    public void displayDetails() {
        legacyItem.print();
    }
}

// New Product
class NewProduct implements Product {
    private String name;

    public NewProduct(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("New Product -> Name: " + name);
    }
}