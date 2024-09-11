/**
 * 
 */
package challenge_CarFactory;

/**
 * 
 */
public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate Cars
		
		FamilySaloon c1 = new FamilySaloon("Audi", "A3", 130, true);
		F1 c2 = new F1("Ferrari", "Maranello", 2330, 1.24);
		F1 c3 = new F1("McLaren", "MCL2016", 2320, 1.12);
		RallyCar c4 = new RallyCar("Subaru", "Impreza", 143, 1.98);
		FamilySaloon c5 = new FamilySaloon("Subaru", "Legacy", 123, false);
		
		// Create Array of Cars
		Car[] cars = new Car[] {c1, c2, c3, c4, c5};
		
		// Displaying all cars details to screen
		displayAllCarsToScreen(cars);
		
		// Output model of car with least horsepower
		
		String modelWithLeastHorsePower = modelWithLeastHorsePower(cars);
		
		System.out.println("The model of car with least horsepower is : " +modelWithLeastHorsePower);
		System.out.println();
		
		// Output all details of the cars of make
		
		String targetMake = "Subaru";
		
		detailsOnCarsOfASpecifiedBrand(cars, targetMake);
		
		// Output Average Horsepower
		
		double average = averageHorsePower(cars);
		
		System.out.printf("The average to 2 decimal places is %.2f", average);
		
	}

	/**
	 * This method calculates and returns the average horsepower
	 * @param cars
	 * @return
	 */
	public static double averageHorsePower(Car[] cars) {
		double average = 0;
		
		double total = 0;
		
		for (Car car : cars) {
			total += car.getHorsePower();
		}
		
		average = total / cars.length;
		return average;
	}

	/**
	 * This care prints to console the details of all cars of the specified brand
	 * @param cars
	 * @param targetMake
	 */
	public static void detailsOnCarsOfASpecifiedBrand(Car[] cars, String targetMake) {
		System.out.println("The details of all " + targetMake + " cars are:");
		System.out.println();
		
		for (Car car : cars) {
			if(car.getMake().equalsIgnoreCase(targetMake)) {
				car.displayAll();
				System.out.println();
			}
		}
	}

	/**
	 * This method calculate the car with least horsepower and returns its brand
	 * @param cars
	 * @return
	 */
	public static String modelWithLeastHorsePower(Car[] cars) {
		String modelWithLeastHorsePower = cars[0].getModel();
		int leastHorsePower = cars[0].getHorsePower();
		
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].getHorsePower() < leastHorsePower) {
				leastHorsePower = cars[i].getHorsePower();
				modelWithLeastHorsePower = cars[i].getModel();
			}
		}
		return modelWithLeastHorsePower;
	}

	/**
	 * This method displays all car details to screen
	 * @param cars
	 */
	public static void displayAllCarsToScreen(Car[] cars) {
		for(Car car : cars) {
			car.displayAll();
			System.out.println();
		}
	}

}
