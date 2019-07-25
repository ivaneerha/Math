public class Product {

    private GoodInformation originAndGood;

    private GoodProperties priceAndQuantity;

    public Product(GoodInformation originAndGood, GoodProperties priceAndQuantity) {
        this.originAndGood = originAndGood;
        this.priceAndQuantity = priceAndQuantity;
    }

    public void setOriginAndGood(GoodInformation originAndGood) {
        this.originAndGood = originAndGood;
    }

    public void setPriceAndQuantity(GoodProperties priceAndQuantity) {
        this.priceAndQuantity = priceAndQuantity;
    }

    public GoodInformation getOriginAndGood() {
        return originAndGood;
    }

    public GoodProperties getPriceAndQuantity() {
        return priceAndQuantity;
    }

    @Override
    public String toString() {
        return "Origin: " + this.originAndGood.getOrigin() + "   Good: " + this.originAndGood.getGood()
                + "   Quantity: " + this.priceAndQuantity.getQuantity() + "   Price: " + this.priceAndQuantity.getPrice();
    }
}
