public class Product implements IDedObject {
    // Note: all data private, methods public (per instructions)
    private int productID;
    private String productName;
    private String supplierName;

    public Product() {
        this.productID = 0;
        this.productName = "";
        this.supplierName = "";
    }

    public Product(int productID, String productName, String supplierName) {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    @Override
    public int getID() {
        return productID;
    }

    @Override
    public void printID() {
        // “prints all the variable values in separate lines”
        System.out.println(productID);
        System.out.println(productName);
        System.out.println(supplierName);
    }

    // Optional getters/setters if you want them
    public int getProductID() { return productID; }
    public String getProductName() { return productName; }
    public String getSupplierName() { return supplierName; }

    public void setProductName(String productName) { this.productName = productName; }
    public void setSupplierName(String supplierName) { this.supplierName = supplierName; }
}
