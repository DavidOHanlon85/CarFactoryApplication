/**
 * 
 */
package challenge_CarFactory;

/**
 * 
 */
public class FamilySaloon extends Car {

	// Instance variables
	
	private boolean metallicPaint;
	
	
	/**
	 * 
	 */
	public FamilySaloon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 * @param metallicPaint
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}

	// Display all method
	
	@Override
	public void displayAll() {
		System.out.println("Family saloon");
		System.out.println("Make\t : " +this.getMake());
		System.out.println("Model\t : " +this.getModel());
		System.out.println("HorsePower : " +this.getHorsePower());
		System.out.println("MetallicPaint\t : " +this.metallicPaint);
	}
	
	

}
