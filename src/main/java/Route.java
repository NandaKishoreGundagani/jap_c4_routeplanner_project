<<<<<<< HEAD
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
=======
class Route{

	Private String fromCity;
	Private String toCity;
	Private String distance;
	Private String time;
	Private String price;

	 public Route (String fromCity, String toCity, String distance, String time, String price) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
        this.time = time;
        this.price = price;

	  public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public String getDistance() {
        return distance;
    }

    public String getTime() {
        return time;
    }

    public String getPrice() {
        return price;
    }

	 public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPrice(String price) {
        this.price = price;
    }

	@Override
    public String toString() {
        return "Pavan{" +
                "fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", distance='" + distance + '\'' +
                ", time='" + time + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    }
	
}
>>>>>>> d6a41df478c611e68f825b350f451e058cc119a8
