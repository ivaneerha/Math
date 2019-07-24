import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Math {
    private ConcurrentHashMap<String, Integer> allInformation;

    public Math(ConcurrentHashMap<String, Integer> info) {
        this.allInformation = info;
    }

    public int getMaxPriceForAGood(String good, int quantity) throws Exception {

        Set<Integer> prices = getAllPricesPerGood(good, quantity);

        if(prices.isEmpty()) {
            throw new Exception("Wrong input!");
        }

        int maxSet = Collections.max(prices);

        return maxSet;
    }

    public int getMinPriceForAGood(String good, int quantity) throws Exception {

        Set<Integer> prices = getAllPricesPerGood(good, quantity);

        int minSet = Collections.min(prices);
        return minSet;
    }

    public int getAvgPriceForAGood(String good, int quantity) throws Exception {

        Set<Integer> prices = getAllPricesPerGood(good, quantity);

        int sum = 0;
        for(int price : prices) {
            sum += price;
        }

        int avg = sum / prices.size();
        return avg;
    }

    public Set<Integer> getAllPricesPerGood(String good, int quantity) {
        Set<Integer> prices = new HashSet<>();

        for(Map.Entry<String, Integer> entry : allInformation.entrySet()) {
            String[] splitInfo = entry.getKey().split("\\.");

            if(splitInfo[1] != null && splitInfo[2] != null
                    && splitInfo[1].equals(good) && Integer.parseInt(splitInfo[2]) == quantity) {
                prices.add(entry.getValue());
            }
        }

        return prices;
    }
}
