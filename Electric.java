/*
 * This is a subclass called Electric, that has few other features additional to the 
 * base class Car. For example the specific features are; the number of trunks, screens
 * super chargers etc.
 */
public class Electric extends Car {

	@Override
	public int getNumberOfSeats() {
		System.out.println("I am an electric car with seats = " + numberOfSeats);
		return numberOfSeats;
	}

	public int getNumberOfWindows() {
		System.out.println("I am an electric car with windows = " + this.numberOfWindows);
		return numberOfWindows;
	}

	public int getNumberOfTrunks() {
		System.out.println("I am an electric car with trunks = " + numberOfTrunks);
		return numberOfTrunks;
	}

	public int getNumberOfScreens() {
		System.out.println("I am an electric car with Screens = " + numberOfScreens);
		return numberOfScreens;
	}

	public int getNumberOfSuperChargers() {
		System.out.println("I am an electric car with SuperChargers = " + numberOfSuperChargers);
		return numberOfSuperChargers;
	}

	public int getNumberOfSensors() {
		System.out.println("I am an electric car with Sensors = " + numberOfSensors);
		return numberOfSensors;
	}

	public int getNumberOfpounds() {
		System.out.println("I am an electric car with Pounds = " + numberOfPounds);
		return numberOfPounds;
	}
}
