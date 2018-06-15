/*
 * This is a base class Car that has all the common car features. 
 * For example, all the cars have an engine, 4 wheels, steering wheel etc.
 */
public class Car {
	private int numberOfPounds = 5000;
	private int numberOfSuperChargers = 0;
	private int numberOfSensors = 0;
	private int numberOfEngines = 0;
	private int numberOfTrunks = 0;
	private int numberOfWindows = 0;
	private int numberOfWheels = 0;
	private int numberOfSeats = 3;
	String company;
	String type;
	String Model;
	float amountOfGas = 20.7f;
	private int numberOfScreens = 0;
	private int numberOfRows = 0;
	private int numberOfTelevisions = 0;
	private int numberOfCupHolders = 0;
	private int numberOfHorsePower = 0;

	public int getNumberOfWheels() {
		System.out.println(numberOfWheels);
		return numberOfWheels;
	}

	public int getNumberOfWindows() {
		System.out.println(numberOfWindows);
		return numberOfWindows;
	}

	public int getNumberOfSeats() {
		System.out.println(numberOfSeats);
		return numberOfSeats;
	}
	
	public int getNumberOfPounds() {
		return numberOfPounds;
	}

	public void setNumberOfPounds(int numberOfPounds) {
		this.numberOfPounds = numberOfPounds;
	}

	public int getNumberOfSuperChargers() {
		return numberOfSuperChargers;
	}

	public void setNumberOfSuperChargers(int numberOfSuperChargers) {
		this.numberOfSuperChargers = numberOfSuperChargers;
	}

	public int getNumberOfSensors() {
		return numberOfSensors;
	}

	public void setNumberOfSensors(int numberOfSensors) {
		this.numberOfSensors = numberOfSensors;
	}

	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	public int getNumberOfTrunks() {
		return numberOfTrunks;
	}

	public void setNumberOfTrunks(int numberOfTrunks) {
		this.numberOfTrunks = numberOfTrunks;
	}

	public int getNumberOfScreens() {
		return numberOfScreens;
	}

	public void setNumberOfScreens(int numberOfScreens) {
		this.numberOfScreens = numberOfScreens;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public int getNumberOfTelevisions() {
		return numberOfTelevisions;
	}

	public void setNumberOfTelevisions(int numberOfTelevisions) {
		this.numberOfTelevisions = numberOfTelevisions;
	}

	public int getNumberOfCupHolders() {
		return numberOfCupHolders;
	}

	public void setNumberOfCupHolders(int numberOfCupHolders) {
		this.numberOfCupHolders = numberOfCupHolders;
	}

	public int getNumberOfHorsePower() {
		return numberOfHorsePower;
	}

	public void setNumberOfHorsePower(int numberOfHorsePower) {
		this.numberOfHorsePower = numberOfHorsePower;
	}

	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public static void main(String args[]) {

		Car car1 = new Car();
		car1.company = " Honda";
		car1.numberOfWheels = 4;
		car1.type = "gas";

		Car car2 = new Car();
		car2.company = "Volvo";
		car2.numberOfWheels = 4;
		car2.type = "eletric";

		Electric car3 = new Electric();
		car3.company = "Tesla";
		car3.setNumberOfWheels(4);
		car3.type = "eletric";
		car3.setNumberOfWindows(10);
		car3.setNumberOfSeats(6);
		car3.setNumberOfTrunks(2);
		car3.setNumberOfScreens(2);
		car3.setNumberOfSuperChargers(9000);
		car3.Model = "model x";
		car3.setNumberOfPounds(5000);

		Gas car4 = new Gas();
		car4.company = " BMW ";
		car4.setNumberOfWheels(4);
		car4.type = "gas";
		car4.setNumberOfWindows(8);
		car4.setNumberOfSeats(7);
		car4.setNumberOfTrunks(1);
		car4.setNumberOfEngines(1);
		car4.setNumberOfRows(3);
		car4.setNumberOfCupHolders(8);
		car4.setNumberOfTelevisions(2);
		car4.setNumberOfHorsePower(445);

		System.out.println("Car one has " + car1.numberOfSeats);
		System.out.println(" car two has " + car2.numberOfSeats);
		System.out.println(" car three has " + car3.getNumberOfSeats());

		System.out.println(car1.company + " is car one");
		System.out.println(car1.company + " has " + car1.numberOfWheels + " number of wheels on the car");
		System.out.println(car1.company + " car is " + car1.type);
		System.out.println(car1.company + " has " + car2.numberOfSeats + " number of seats ");

		System.out.println(car2.company + " has " + car2.numberOfSeats + " number of seats ");
		System.out.println(car2.company + " has " + car2.numberOfWheels + " wheels on the car ");
		System.out.println(car2.company + " is an " + car2.type + " car ");
		System.out.println(car2.company + " is car two ");
		System.out.println(car3.company + " is an electric car and its model is the model x ");

	}
}
