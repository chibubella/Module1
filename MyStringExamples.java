
public class MyStringExamples {
	public static void main(String[] args) {
		String ex1 = new String ("Mary has a little lamb");
		
		String ex2 = "Mary has a little lamb ";
		System.out.println ("is ex1 and ex2 at the same memory location? " + (ex1==ex2));
		
		String ex3 = "Mary has a little lamb";
		System.out.println ("is ex2 and ex3 at the same memory location? " + (ex2==ex3));
		
		//String comparison
		System.out.println("Is ex1 and ex2 the same string? " + ex1.equals(ex2) + " " +ex1.compareTo(ex2));
		
		
		//String length & char stuff
		System.out.println("Length of ex1 is " + ex1.length() );
		System.out.println("Character at index position 15 is " + ex1.charAt(15));
		System.out.println("Substring up to index position 15 is " + ex1.substring(0,22));
		//Concatenation
		System.out.println (ex1.concat(ex3));
		
		//using regular expression
		System.out.println( "912-478-5351".matches("\\d{3}-\\d{3}-\\d{4}"));
		System.out.println( "912-478-5351".matches("\\d{3}-\\d{3}-\\d{4}"));
		
	}

}
