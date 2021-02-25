package vishal;

public class Innings {
	String end="second";
	String teamname;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	String inningsname;
	int runs;
	

	public void displayInningsDetails(int run2, String ses) {
		if(inningsname.equals(end))
		{
			System.out.println("Match Ended");
		}
		else
		{
			int runNeed=run2+1;
			System.out.println("Needs "+runNeed+" to win");
		}
		
	}
	
	

}
