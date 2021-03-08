package com.ltts.model.Player;

public class Player {
	private int playerNo;
	private String playerName;
	private String playerSkill;
	private int teamid;
	private String playercountry;
	private String dob;
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Player(int playerNo, String playerName, String playerSkill, int teamid, String playercountry,String dob) {
		super();
		this.playerNo = playerNo;
		this.playerName = playerName;
		this.playerSkill = playerSkill;
		this.teamid = teamid;
		this.playercountry = playercountry;
		this.dob=dob;
	}

	public Player() {
		super();
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerSkill() {
		return playerSkill;
	}

	public void setPlayerSkill(String playerSkill) {
		this.playerSkill = playerSkill;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getPlayercountry() {
		return playercountry;
	}

	public void setPlayercountry(String playercountry) {
		this.playercountry = playercountry;
	}

	@Override
	public String toString() {
		return "Player [playerNo=" + playerNo + ", playerName=" + playerName + ", playerSkill=" + playerSkill
				+ ", teamid=" + teamid + ", playercountry=" + playercountry + "]";
	}
	
	
}
