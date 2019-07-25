import java.util.Map;

public class MathThread extends Thread {

    private Math math;

    public MathThread(Math math) {
        this.math = math;
    }

    @Override
    public void run() {

        while(true) {
            Map<String, Double> functions = math.minMaxAvgForAllGoods();

            for (Map.Entry<String, Double> entry : functions.entrySet()) {
                System.out.println(entry.getKey() + "   -   " + entry.getValue());
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n\n\n");
        }
    }
}
