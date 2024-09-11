/**
 * 
 */
package challenge_CarFactory;

/**
 * 
 */
public class RallyCar extends Car {
	
	// Instance variables
	
	private double area;
	
	// Constructors

	/**
	 * Default constructor
	 */
	public RallyCar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 * @param area
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}

	// Getters and setters
	
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	// Display all method
	
	@Override
	public void displayAll() {
		System.out.println("Rally car");
		System.out.println("Make\t : " +this.getMake());
		System.out.println("Model\t : " +this.getModel());
		System.out.println("HorsePower : " +this.getHorsePower());
		System.out.println("Area\t : " +this.area);
	}

	
	
}
