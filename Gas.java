/*
 * This is a subclass called Gas, that has few other features additional to the 
 * base class Car. For example the specific features are; the number of rows, 
 * Televisions, cup holders etc.
 */
public class Gas extends Car {
	Gas gasVar = new Gas();
	@Override
	public int getNumberOfSeats() {
		System.out.println("I am a gas car with seats = " + gasVar.getNumberOfSeats());
		return gasVar.getNumberOfSeats();
	}

	public int getNumberOfWindows() {
		System.out.println("I am an gas car with windows = " + gasVar.getNumberOfWindows());
		return gasVar.getNumberOfWindows();
	}

	public int getNumberOfTrunks() {
		System.out.println("I am an gas car with trunks = " +gasVar.getNumberOfTrunks());
		return gasVar.getNumberOfTrunks();
	}
	public int getNumberOfEngines() {
		System.out.println("I am an gas car with Engines = " + gasVar.getNumberOfEngines());
		return gasVar.getNumberOfEngines();
	}

	public int getNumberOfRows() {
		System.out.println("I am an gas car with Rows = " + gasVar.getNumberOfRows());
		return gasVar.getNumberOfRows();
	}

	public int getNumberOfTelevisions() {
		System.out.println("I am an gas car with televisions = " + gasVar.getNumberOfTelevisions());
		return gasVar.getNumberOfTelevisions();
	}

	public int getNumberOfCupHolders() {
		System.out.println("I am an gas car with Cup Holders = " + gasVar.getNumberOfCupHolders());
		return gasVar.getNumberOfCupHolders();
	}

	public int getNumberOfHorsePower() {
		System.out.println("I am an gas car with Horse Power = " + gasVar.getNumberOfHorsePower());
		return gasVar.getNumberOfHorsePower();
	}
}