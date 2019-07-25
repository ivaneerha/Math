import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Map<GoodInformation, GoodProperties> allInformation = new HashMap<>();

        allInformation.put(new GoodInformation("Europe", "Milk"), new GoodProperties(5.1, 20));
        allInformation.put(new GoodInformation("Am", "Milk"), new GoodProperties(44.0, 20));
        allInformation.put(new GoodInformation("Amv", "Milk"), new GoodProperties(145.4, 20));
        allInformation.put(new GoodInformation("Europe", "Milk"), new GoodProperties(3.2222, 35));

//        allInformation.put(new GoodInformation("Am", "Egg"), new GoodProperties(144.1, 15));
//        allInformation.put(new GoodInformation("Am", "Egg"), new GoodProperties(24.9, 15456));
//        allInformation.put(new GoodInformation("Am", "Egg"), new GoodProperties(224.5, 412));
//        allInformation.put(new GoodInformation("Am", "Egg"), new GoodProperties(2104.0, 4));
//        allInformation.put(new GoodInformation("Am", "Egg"), new GoodProperties(4.5, 725));

        NewMath math = new NewMath(allInformation);

//        try {
//            double abc = math.getMaxPriceForAGood("Milk", 20);
//            System.out.println(abc);
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        Set<Integer> allPricesPerGood = math.getAllPricesPerGood("Milk", 20);
//
//        for(Integer price: allPricesPerGood) {
//            System.out.println(price);
//        }

//        Set<Product> goodsPricesPerRegion = math.getAllGoodsPricesPerRegion("Am");
//        for(Product product : goodsPricesPerRegion) {
//            System.out.println(product);
//        }

        Map<String, Double> kkk = new HashMap<>();

        Set<String> metGoods = new HashSet<>();

        for(Map.Entry<GoodInformation, GoodProperties> entry : allInformation.entrySet()) {
           String good = entry.getKey().getGood();
           if(metGoods.contains(good + "" + entry.getValue().getQuantity())) {
               continue;
           } else {
               metGoods.add(good + "" + entry.getValue().getQuantity());
           }

            System.out.println("ooo");

           int quantity = entry.getValue().getQuantity();

           try{
               double max = math.getMaxPriceForAGood(good, quantity);
               double min = math.getMinPriceForAGood(good, quantity);
               double avg = math.getAvgPriceForAGood(good, quantity);

               kkk.put(good + "." + quantity + ".Min", min);
               kkk.put(good + "." + quantity + ".Max", max);
               kkk.put(good + "." + quantity + ".Avg", avg);

           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
        }

        for(Map.Entry<String, Double> entry : kkk.entrySet()) {
            System.out.println(entry.getKey() + "   -   " + entry.getValue());
        }

    }
}


