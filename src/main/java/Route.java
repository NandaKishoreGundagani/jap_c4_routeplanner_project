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