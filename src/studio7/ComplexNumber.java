package studio7;

public class ComplexNumber {

	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public ComplexNumber add(ComplexNumber other) {
		return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
	}
	
	public ComplexNumber multiply(ComplexNumber other) {
		double newReal = this.real * other.real - this.imaginary * other.imaginary;
		double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
		return new ComplexNumber(newReal, newImaginary);
	}
	
	public String toString() {
		return this.real + " + " + this.imaginary + " i ";
	}
	
	public static void main(String[] args) {
		ComplexNumber two = new ComplexNumber(2,3);
		System.out.println(two);
		ComplexNumber three = new ComplexNumber(3,2);
		System.out.println(two.add(three));
		System.out.println(two.multiply(three));
	}
}
