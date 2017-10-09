
public class TestByValue {
	String name = "Mary";
	public static void main (String [] args) {
	TestByValue tbv = new TestByValue();
	
	int x = 5;
	System.out.println("X was " + x);
	
	tbv.changeX(x);
	System.out.println ( "X is now " + x);
	
	tbv.changeName(tbv.name);
	
	System.out.println("Name is now " + tbv.name);
	}
	
	public void changeX (int x) {
		x = x+20;
	}
	
	
	public void changeName ( String name ) {
		this.name = name + " Lamb";
	}
}
