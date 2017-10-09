
public class Student {
	public String name;
	public String getName() {
		return this.name;
		
	}
	public Student() {
		this.name = "Adrienne";
	}
	public static void main ( String[] args) {
		Student s1 = new Student("Bella");
		System.out.println ( "This is student " + s1.getName());
		
		Student s2 = new Student ();
		System.out.println("This is student " + s2.getName());

	}
	 public Student ( String name) {
		 this.name = name;
	 }
	
	

}
