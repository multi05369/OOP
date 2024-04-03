
public class Product<T> {
    private T details;
    private double price;
    
    public void setDetails(T details) {
        this.details = details;
    }
    public T getDetails() {
        return this.details;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public Product(T details, double price) {
        this.details = details;
        this.price = price;
    }
}
