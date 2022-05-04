public class Route {
    private String fromCity;
    private String toCity;
    private int kms;
    private String time;
    private String fare;

    public Route(String fromCity, String toCity, int kms, String time, String fare) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.kms = kms;
        this.time = time;
        this.fare = fare;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Route{" +
                "fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", kms=" + kms +
                ", time='" + time + '\'' +
                ", fare='" + fare + '\'' +
                '}';
    }
}
