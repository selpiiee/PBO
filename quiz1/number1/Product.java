public class Product {
    private String productId;
    private String productName;
    private float productPrice;
    private String productType;

    public Product (String productId, String productName, float productPrice, String productType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getProductType() {
         return productType;
    }

    public void addProduct() {
        System.out.println("Product " + productName + " successfully added");
    }

    public void modifyProduct(String newProductName, float newProductPrice, String newProductType) {
        this.productName = newProductName;
        this.productPrice = newProductPrice;
        this.productType = newProductType;
        System.out.println("Product ID " + productId + " updated");
    }

    public void selectProduct(String productId) {
        if (this.productId != null && this.productId.equals(productId)) {
            System.out.println("Product Found!");
            getInfo();
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void getInfo() {
        System.out.println("---- Detail Product ----");
        System.out.println("Product ID\t: " + productId);
        System.out.println("Product Price\t: Rp" + String.format("%,.0f", productPrice));
        System.out.println("Product Type\t: " + productType);
        System.out.println("---------------------------");
    }
}
