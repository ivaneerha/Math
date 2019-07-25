
public class GoodInformation {

    private String origin;
    private String good;

    public String getOrigin() {
        return this.origin;
    }

    public GoodInformation(String origin, String good) {
        this.origin = origin;
        this.good = good;
    }

    public void setOrigin (String origin) {
        this.origin = origin;
    }

    public String getGood() {
        return this.good;
    }

    public void setGood(String good) {
        this.good = good;
    }
}
