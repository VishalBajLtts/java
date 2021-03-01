package vishal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class ComparableMatch implements Comparable<ComparableMatch> {
	private String matchDate ;
	  
	private String teamOne ;
	private String teamTwo; 
		public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public ComparableMatch(String matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	@Override
	public int compareTo(ComparableMatch cm) {
		// TODO Auto-generated method stub
		return -(matchDate.compareTo(cm.matchDate));
	}
	
	
	
	
	
		
}

