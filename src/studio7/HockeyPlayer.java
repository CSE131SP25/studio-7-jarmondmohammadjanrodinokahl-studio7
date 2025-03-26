package studio7;

public class HockeyPlayer {

	private String name;
	private int jerseyNumber;
	private boolean shootRight;
	private boolean shootLeft;
	private boolean rightHanded;
	private int goals;
	private int assists;
	private int gamesPlayed;
	
	public HockeyPlayer(String name, int jersey, boolean shootRight, boolean shootLeft, boolean rightHanded) {
		this.name = name;
		this.jerseyNumber = jersey;
		this.shootRight = shootRight;
		this.shootLeft = shootLeft;
		this.rightHanded = rightHanded;
		this.goals = goals;
		this.assists = assists;
		this.gamesPlayed = gamesPlayed;
	}
	
	public void completeGame (int goals, int assists) {
		this.goals += goals;
		this.assists += assists;
		this.gamesPlayed++; 
	}
	
	public int getPoints() {
		return this.goals + this.assists;
	}
	
	public String toString() {
		return "HockeyPlayer [name=" + name + ", jerseyNumber=" + jerseyNumber + ", goals=" + goals + ", assists="
				+ assists + ", gamesPlayed=" + gamesPlayed + "]";
	}
	
	public static void main(String[] args) {
		HockeyPlayer tali = new HockeyPlayer("Tali", 30, true, true, true);
		System.out.println(tali);
		tali.completeGame(2,3);
		System.out.println(tali);
		tali.completeGame(10,12);
		System.out.println(tali);
		
	}
}
