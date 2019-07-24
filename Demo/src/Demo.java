import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> allInformation = new ConcurrentHashMap<>();

        allInformation.put("Europe.Milk.20", 5);
        allInformation.put("Am.Milk.20", 44);
        allInformation.put("Amv.Milk.20", 144);
        allInformation.put("Europe.Milk.35", 3);
        allInformation.put("Am.Egg.15", 144);
        allInformation.put("Am.Egg.1554", 24);
        allInformation.put("Am.Egg.1553", 224);
        allInformation.put("Am.Egg.1551", 2104);
        allInformation.put("Am.Egg.1552", 4);

        Math math = new Math(allInformation);

        try {
            int abc = math.getMaxPriceForAGood("Milk", 20);
            System.out.println(abc);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        Set<Integer> allPricesPerGood = math.getAllPricesPerGood("Milk", 20);
//
//        for(Integer price: allPricesPerGood) {
//            System.out.println(price);
//        }
    }
}


