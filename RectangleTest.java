
public class RectangleTest {
	public static void main (String [] args)
	{
		Rectangle_new r1 = new Rectangle_new();
		Rectangle_new r2 = new Rectangle_new();
		r1.setLength(10);
		r2.setLength(5);
		r1.setWidth(10);
		r2.setWidth(10);
		System.out.println("The length of r1 is " + r1.getLength() + ", width is " + r1.getWidth());
		System.out.println("The length of r2 is " + r2.getLength() + ", width is " + r2.getWidth());
		System.out.println("The area of r1 is " + r1.getArea(r1.getLength(),r1.getWidth()) );
		System.out.println("The area of r2 is " + r2.getArea(r2.getLength(),r2.getWidth()) );
	}

}
