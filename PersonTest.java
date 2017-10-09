
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName ("Mary");
		Person p2 = new Person();
		p2.setName ("Bob");

		//primitives copying etc
		int x = 5;
		int y = 7;
		int j = x + y;
		//copy
		x = y;
		System.out.println("x is " + x + " y is " + y + " j is " + j);
		
		//copy objects
		p1 = p2;
		System.out.println("p1 name is " + p1.getName() + " p2 name is " + p2.getName());
		
		p1.setName("Bobby");
		System.out.println("p1 name is " + p1.getName() + " p2 name is " + p2.getName());
	}

}
