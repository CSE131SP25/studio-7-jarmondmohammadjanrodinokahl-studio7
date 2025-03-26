package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	public Fraction add(Fraction other) {
		int newNumerator = (this.denominator * other.numerator + other.denominator * this.numerator);
		int newDenominator = (this.denominator * other.denominator);
		Fraction result = new Fraction(newNumerator, newDenominator);
		return result;
	}
	
	public Fraction multiply(Fraction other) {
		return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
	}
	
	public Fraction reciprocal() {
		return new Fraction(this.denominator, this.numerator);
	}
	
	public Fraction simplify() {
		int divisor= gcd(this.numerator, this.denominator);
		return new Fraction(this.numerator / divisor, this.denominator / divisor);
	}
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		} else {
			return gcd(q, p % q);
		}
	
	}
	
	public static void main(String[] args) {
		Fraction oneHalf = new Fraction (1,2);
		Fraction twoThirds = new Fraction (2,3);
		Fraction sum = oneHalf.add(twoThirds);
		System.out.println(sum);
		Fraction product = oneHalf.multiply(twoThirds);
		System.out.println(product);
		System.out.println(twoThirds.reciprocal());
		Fraction bigFraction = new Fraction (18,24);
		System.out.println(bigFraction.simplify());
	}
}
