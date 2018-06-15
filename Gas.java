/*
 * This is a subclass called Gas, that has few other features additional to the 
 * base class Car. For example the specific features are; the number of rows, 
 * Televisions, cup holders etc.
 */
public class Gas extends Car {

	@Override
	public int getNumberOfSeats() {
		System.out.println("I am a gas car with seats = " + numberOfSeats);
		return numberOfSeats;
	}

	public int getNumberOfWindows() {
		System.out.println("I am an gas car with windows = " + numberOfWindows);
		return numberOfWindows;
	}

	public int getNumberOfTrunks() {
		System.out.println("I am an gas car with trunks = " + numberOfTrunks);
		return numberOfTrunks;
	}
	public int getNumberOfEngines() {
		System.out.println("I am an gas car with Engines = " + numberOfEngines);
		return numberOfEngines;
	}

	public int getNumberOfRows() {
		System.out.println("I am an gas car with Rows = " + numberOfRows);
		return numberOfRows;
	}

	public int getNumberOfTelevisions() {
		System.out.println("I am an gas car with televisions = " + numberOfTelevisions);
		return numberOfTelevisions;
	}

	public int getNumberOfCupHolders() {
		System.out.println("I am an gas car with Cup Holders = " + numberOfCupHolders);
		return numberOfCupHolders;
	}

	public int getNumberOfHorsePower() {
		System.out.println("I am an gas car with Horse Power = " + numberOfHorsePower);
		return numberOfHorsePower;
	}
}