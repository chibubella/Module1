
public class FleetTester {

	public static void main(String[] args) {
		Car c = new Car (4, "Red");
		System.out.println ("Car c has " + c.getNumOfWheels() +" wheels and is " + c.getColor() + " in color");
		
		Bicycle b = new Bicycle ( 2, "Purple");
		b.setNumOfGears(5);
		
		System.out.println ( "Bicycle b has " + b.getNumOfWheels() +" wheels and is " + b.getColor() + " in color");
		System.out.println("Does bicycle b have baskets: " + b.isBasket());
		System.out.println("How many gears does bike b have?:  " + b.getNumOfGears());
	}

}
