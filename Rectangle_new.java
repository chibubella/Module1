
public class Rectangle_new {
	private double length;
	private double width;
	
	public void setLength(double length) {
		if (length < 0) return;
		this.length = length;
	}

	public void setWidth ( double width) {
		this.width = width;
	}
	
	public double getLength (){
		return this.length;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double getArea ( double length, double width) {
		double Area = this.length * this.width;
		return Area;
	}
	
	public double getPerimeter (double length, double width)
	{
		double Perimeter = 2* (this.length + this.width);
		return Perimeter;
	}
	
}
