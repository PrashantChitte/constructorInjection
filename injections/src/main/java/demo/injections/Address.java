package demo.injections;

public class Address {

	public String city;
	public String lane;

	public Address() {
		super();
	}

	public Address(String city, String lane) {
		super();
		this.city = city;
		this.lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", lane=" + lane + "]";
	}

}
