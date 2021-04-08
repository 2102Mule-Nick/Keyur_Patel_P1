package com.revature.pojo;

public class SMSPlayer {
	
	public int playerID;
	
	public int webUserId;
	
	public String userName;
	
	public String playerBatStyle;
	
	public String playerBowlStyle;
	
	public int teamId;
	
	public int tournamentId;

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public int getWebUserId() {
		return webUserId;
	}

	public void setWebUserId(int webUserId) {
		this.webUserId = webUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPlayerBatStyle() {
		return playerBatStyle;
	}

	public void setPlayerBatStyle(String playerBatStyle) {
		this.playerBatStyle = playerBatStyle;
	}

	public String getPlayerBowlStyle() {
		return playerBowlStyle;
	}

	public void setPlayerBowlStyle(String playerBowlStyle) {
		this.playerBowlStyle = playerBowlStyle;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public SMSPlayer(int playerID, int webUserId, String userName, String playerBatStyle, String playerBowlStyle,
			int teamId, int tournamentId) {
		super();
		this.playerID = playerID;
		this.webUserId = webUserId;
		this.userName = userName;
		this.playerBatStyle = playerBatStyle;
		this.playerBowlStyle = playerBowlStyle;
		this.teamId = teamId;
		this.tournamentId = tournamentId;
	}

	public SMSPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SMSPlayer [playerID=" + playerID + ", webUserId=" + webUserId + ", userName=" + userName
				+ ", playerBatStyle=" + playerBatStyle + ", playerBowlStyle=" + playerBowlStyle + ", teamId=" + teamId
				+ ", tournamentId=" + tournamentId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerBatStyle == null) ? 0 : playerBatStyle.hashCode());
		result = prime * result + ((playerBowlStyle == null) ? 0 : playerBowlStyle.hashCode());
		result = prime * result + playerID;
		result = prime * result + teamId;
		result = prime * result + tournamentId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + webUserId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SMSPlayer other = (SMSPlayer) obj;
		if (playerBatStyle == null) {
			if (other.playerBatStyle != null)
				return false;
		} else if (!playerBatStyle.equals(other.playerBatStyle))
			return false;
		if (playerBowlStyle == null) {
			if (other.playerBowlStyle != null)
				return false;
		} else if (!playerBowlStyle.equals(other.playerBowlStyle))
			return false;
		if (playerID != other.playerID)
			return false;
		if (teamId != other.teamId)
			return false;
		if (tournamentId != other.tournamentId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (webUserId != other.webUserId)
			return false;
		return true;
	}

	
}
