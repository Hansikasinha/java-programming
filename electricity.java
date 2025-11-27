class Product {
    int productId;
    Product(int productId) {
        this.productId = productId;
    }
    void showDetails() {
        System.out.println("Product ID: " + productId);
    }
}
class Electronics extends Product {
    int warranty;
    Electronics(int productId, int warranty) {
        super(productId);  
        this.warranty = warranty;
    }
    @Override
    void showDetails() {
        super.showDetails();  
        System.out.println("Warranty: " + warranty + " years");
    }
}
public class electricity {
    public static void main(String[] args) {
        Electronics e = new Electronics(101, 2);
        e.showDetails();
    }
}