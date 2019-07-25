import java.util.*;

public class NewMath {
    private Map<GoodInformation, GoodProperties> allInformation;

    public NewMath(Map<GoodInformation, GoodProperties> info) {
        this.allInformation = info;
    }

    public double getMaxPriceForAGood(String good, int quantity) throws Exception {

        Set<Double> prices = getAllPricesPerGood(good, quantity);

        if(prices.isEmpty()) {
            throw new Exception("Wrong input!");
        }

        double maxSet = Collections.max(prices);

        return maxSet;
    }

    public double getMinPriceForAGood(String good, int quantity) throws Exception {

        Set<Double> prices = getAllPricesPerGood(good, quantity);

        double minSet = Collections.min(prices);
        return minSet;
    }

    public double getAvgPriceForAGood(String good, int quantity) throws Exception {

        Set<Double> prices = getAllPricesPerGood(good, quantity);

        double sum = 0;
        for(double price : prices) {
            sum += price;
        }

        double avg = sum / prices.size();
        return avg;
    }

    public Set<Double> getAllPricesPerGood(String good, int quantity) {
        Set<Double> prices = new HashSet<>();

        for(Map.Entry<GoodInformation, GoodProperties> entry : allInformation.entrySet()) {

            String goodFromTheMarket = entry.getKey().getGood();
            int quantityFromTheMarket = entry.getValue().getQuantity();

            if(goodFromTheMarket.equals(good) && quantityFromTheMarket == quantity) {
                prices.add(entry.getValue().getPrice());
            }
        }

        return prices;
    }

    public  Set<Product> getAllGoodsPricesPerRegion (String origin) {
        Set<Product> goodsPerRegion = new HashSet<>();

        for(Map.Entry<GoodInformation, GoodProperties> entry : allInformation.entrySet()) {
            if(entry.getKey().getOrigin().equals(origin)) {
                goodsPerRegion.add(new Product(entry.getKey(), entry.getValue()));
            }
        }

        return goodsPerRegion;
    }
}
