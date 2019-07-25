import java.util.*;

public class Math {
    private Map<GoodInformation, Set<GoodProperties>> allInformation;

    public Math(Map<GoodInformation, Set<GoodProperties>> info) {
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

    public Set<Double> getAllPricesPerGood(String good, int quantity) throws Exception {
        Set<Double> prices = new HashSet<>();

        for(Map.Entry<GoodInformation, Set<GoodProperties>> entry : allInformation.entrySet()) {

            String goodFromTheMarket = entry.getKey().getGood();

            Set<GoodProperties> value;
            value = entry.getValue();

            if(goodFromTheMarket.equals(good)) {
                for (GoodProperties goodPropertie : value) {
                    if (goodPropertie.getQuantity() == quantity) {
                        prices.add(goodPropertie.getPrice());
                    }
                }
            } else {
                throw new Exception("Wrong input!");
            }
        }

        return prices;
    }


    public Set<GoodProperties> getAllGoodsPricesPerRegion (String origin) throws Exception {
        Set<GoodProperties> properties = new HashSet<>();

        for(Map.Entry<GoodInformation, Set<GoodProperties>> entry : allInformation.entrySet()) {
            if(entry.getKey().getOrigin().equals(origin)) {
                properties = entry.getValue();
            } else {
                throw new Exception("Wrong input!");
            }
        }

        return properties;
    }

    public Map<String, Double> minMaxAvgForAllGoods() {
        Map<String, Double> kkk = new HashMap<>();

        Set<String> metGoodAndQuantity = new HashSet<>();

        for(Map.Entry<GoodInformation, Set<GoodProperties>> entry : allInformation.entrySet()) {
            String good = entry.getKey().getGood();

            Set<GoodProperties> properties = entry.getValue();
            int quantity = 0;

            for(GoodProperties property : properties) {
                quantity = property.getQuantity();
                if(metGoodAndQuantity.contains(quantity + "")) {
                    continue;
                } else {
                    metGoodAndQuantity.add(quantity + "");
                }

                System.out.println("ooo");
                try{
                    double max = getMaxPriceForAGood(good, quantity);
                    double min = getMinPriceForAGood(good, quantity);
                    double avg = getAvgPriceForAGood(good, quantity);

                    kkk.put(good + "." + quantity + ".Min", min);
                    kkk.put(good + "." + quantity + ".Max", max);
                    kkk.put(good + "." + quantity + ".Avg", avg);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


        }

        return kkk;
    }

    public int ggg() {
        return new Random().nextInt(100);
    }
}
