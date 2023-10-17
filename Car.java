public class Car extends Services {
	private String licensePlate;
	private int year;
	private String make;
	private int numDoors;
	private int price;
	
	public Car(String licensePlate, int year, String make, int numDoors, int price) {
		this.licensePlate = licensePlate;
		this.year = year;
		this.make = make;
		this.price = price;
		this.numDoors = numDoors;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public int getYear() {
		return year;
	}

	public String getMake() {
		return make;
	}
	
	public int getNumDoors() {
		return numDoors;
	}
	public int getPrice() {
		return price;
	}
	//private char[] licensePlate;

	//private int year;

	//private char[] make;

	//private int doors;

}
