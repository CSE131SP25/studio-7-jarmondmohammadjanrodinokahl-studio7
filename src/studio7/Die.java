package studio7;

public class Die {

	private int numberOfSides;
	
	public Die(int sides) {
		this.numberOfSides = sides;
	}
	
	public int roll() {
		return (int) (Math.random() * this.numberOfSides + 1);
	}
	
	public static void main(String[] args) {
		Die sixSides = new Die(100);
		for(int i = 0; i < 10; i++) {
			System.out.println(sixSides.roll());
		}
	}
}
