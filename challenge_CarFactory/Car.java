/**
 * 
 */
package challenge_CarFactory;

/**
 * 
 */
public class Car {

	// Instance variables

	private String make;
	private String model;
	private int horsePower;

	// Constructors

	/**
	 * Default constructor
	 */

	public Car() {

	}

	/**
	 * Car constructor with args
	 * 
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(String make, String model, int horsePower) {
		super();
		this.make = make;
		this.model = model;
		this.setHorsePower(horsePower);
	}

	// Getters and setters

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * Horsepower setter method with business rules
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if (horsePower < 0 || horsePower > 1000) {
			this.horsePower = -999;
		} else {
			this.horsePower = horsePower;
		}
	}
	
	public void displayAll() {
		System.out.println("Car");
		System.out.println("Make\t : " +this.make);
		System.out.println("Model\t : " +this.model);
		System.out.println("HorsePower : " +this.horsePower);
	}

}
