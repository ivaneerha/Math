public class GoodProperties {

    private double price;
    private int quantity;

    public GoodProperties(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
