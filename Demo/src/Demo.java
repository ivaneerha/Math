import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Map<GoodInformation, Set<GoodProperties>> allInformation = new HashMap<>();

        Set<GoodProperties> set1 = new HashSet<>();

        set1.add(new GoodProperties(3.2222, 35));
        set1.add(new GoodProperties(3222.0, 35));
        set1.add(new GoodProperties(22.0, 35));
        set1.add(new GoodProperties(222.0, 35));

        set1.add( new GoodProperties(4.0, 20));
        set1.add( new GoodProperties(1.0, 20));
        set1.add(new GoodProperties(5.1, 20));

//        set1.add( new GoodProperties(0.0, 20));

//        allInformation.put(new GoodInformation("Europe", "Milk"), new GoodProperties(5.1, 20));
//        allInformation.put(new GoodInformation("Am", "Milk"), new GoodProperties(44.0, 20));
//        allInformation.put(new GoodInformation("Amv", "Milk"), new GoodProperties(145.4, 20));
//        allInformation.put(new GoodInformation("Europe", "Milk"), new GoodProperties(3.2222, 35));

        allInformation.put(new GoodInformation("Europe", "Milk"), set1);

        Math math = new Math(allInformation);



//        try {
//            double min = math.getMinPriceForAGood("Milk", 20);
//            System.out.println(min);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }



//        Set<GoodProperties> allGoodsPricesPerRegion;
//        try {
//            allGoodsPricesPerRegion = math.getAllGoodsPricesPerRegion("Europe");
//
//            for(GoodProperties properties : allGoodsPricesPerRegion) {
//                System.out.println(properties);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }










//        Map<String, Double> kkk = math.minMaxAvgForAllGoods();
//
//        for(Map.Entry<String, Double> entry : kkk.entrySet()) {
//            System.out.println(entry.getKey() + "   -   " + entry.getValue());
//        }


        MathThread thread = new MathThread(math);

        thread.start();

    }
}


