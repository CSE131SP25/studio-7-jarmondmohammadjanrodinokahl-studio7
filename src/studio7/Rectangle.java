package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double computeArea() {
		return this.length * this.width;
	}
	
	public double computePerimeter() {
		return this.length * 2 + this.width * 2;
	}
	
	public boolean isSmallerThan(Rectangle r1) {
		boolean isSmaller = this.computeArea() < r1.computeArea();
		return isSmaller;
	}
	
	public boolean isSquare() {
		return this.length == this.width;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4);
		System.out.println(r.computeArea());
		System.out.println(r.computePerimeter());
		
		Rectangle r2 = new Rectangle(4,5);
		System.out.println(r.isSmallerThan(r2));
		
		Rectangle square = new Rectangle(5,5);
		System.out.println(square.isSquare());
		System.out.println(r.isSquare());
	}
}
