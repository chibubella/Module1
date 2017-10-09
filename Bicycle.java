
public class Bicycle extends Vehicle{

	public Bicycle ( int numOfWheels, String color) {
		super (numOfWheels, color);
		
	}
	
	private int numOfGears;
	private boolean basket;
	
	public int getNumOfGears() {
		return numOfGears;
	}

	public void setNumOfGears(int numOfGears) {
		this.numOfGears = numOfGears;
	}

	public boolean isBasket() {
		return basket;
	}

	public void setBasket(boolean basket) {
		this.basket = basket;
	}

	
	
}
