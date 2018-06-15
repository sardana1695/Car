/*
 * This is a subclass called Electric, that has few other features additional to the 
 * base class Car. For example the specific features are; the number of trunks, screens
 * super chargers etc.
 */
public class Electric extends Car {
	Electric electricVar = new Electric();
	@Override
	public int getNumberOfSeats() {
		System.out.println("I am an electric car with seats = " + electricVar.getNumberOfSeats());
		return electricVar.getNumberOfSeats();
	}

	public int getNumberOfWindows() {
		System.out.println("I am an electric car with windows = " + electricVar.getNumberOfWindows());
		return electricVar.getNumberOfWindows();
	}

	public int getNumberOfTrunks() {
		System.out.println("I am an electric car with trunks = " + electricVar.getNumberOfTrunks());
		return electricVar.getNumberOfTrunks();
	}

	public int getNumberOfScreens() {
		System.out.println("I am an electric car with Screens = " + electricVar.getNumberOfScreens());
		return electricVar.getNumberOfScreens();
	}

	public int getNumberOfSuperChargers() {
		System.out.println("I am an electric car with SuperChargers = " + electricVar.getNumberOfSuperChargers());
		return electricVar.getNumberOfSuperChargers();
	}

	public int getNumberOfSensors() {
		System.out.println("I am an electric car with Sensors = " + electricVar.getNumberOfSensors());
		return electricVar.getNumberOfSensors();
	}

	public int getNumberOfpounds() {
		System.out.println("I am an electric car with Pounds = " + electricVar.getNumberOfPounds());
		return electricVar.getNumberOfPounds();
	}
}
