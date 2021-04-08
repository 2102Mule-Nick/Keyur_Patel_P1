package com.revature.pojo;

public class SMSTournament {
	
	public int tournamentId;
	
	public String tournamentName;

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public SMSTournament(int tournamentId, String tournamentName) {
		super();
		this.tournamentId = tournamentId;
		this.tournamentName = tournamentName;
	}

	public SMSTournament() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SMSTournament [tournamentId=" + tournamentId + ", tournamentName=" + tournamentName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tournamentId;
		result = prime * result + ((tournamentName == null) ? 0 : tournamentName.hashCode());
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
		SMSTournament other = (SMSTournament) obj;
		if (tournamentId != other.tournamentId)
			return false;
		if (tournamentName == null) {
			if (other.tournamentName != null)
				return false;
		} else if (!tournamentName.equals(other.tournamentName))
			return false;
		return true;
	}
	
	

}
