package com.revature.pojo;

public class SMSRecord {
	
	public int recordId;
	
	public String recordName;
	
	public int totalGame;
	
	public int runs;
	
	public double batAve;
	
	public String debutDate;
	
	public int playerId;

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public int getTotalGame() {
		return totalGame;
	}

	public void setTotalGame(int totalGame) {
		this.totalGame = totalGame;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public double getBatAve() {
		return batAve;
	}

	public void setBatAve(double batAve) {
		this.batAve = batAve;
	}

	public String getDebutDate() {
		return debutDate;
	}

	public void setDebutDate(String debutDate) {
		this.debutDate = debutDate;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public SMSRecord(int recordId, String recordName, int totalGame, int runs, double batAve, String debutDate,
			int playerId) {
		super();
		this.recordId = recordId;
		this.recordName = recordName;
		this.totalGame = totalGame;
		this.runs = runs;
		this.batAve = batAve;
		this.debutDate = debutDate;
		this.playerId = playerId;
	}

	public SMSRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SMSRecord [recordId=" + recordId + ", recordName=" + recordName + ", totalGame=" + totalGame + ", runs="
				+ runs + ", batAve=" + batAve + ", debutDate=" + debutDate + ", playerId=" + playerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batAve);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((debutDate == null) ? 0 : debutDate.hashCode());
		result = prime * result + playerId;
		result = prime * result + recordId;
		result = prime * result + ((recordName == null) ? 0 : recordName.hashCode());
		result = prime * result + runs;
		result = prime * result + totalGame;
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
		SMSRecord other = (SMSRecord) obj;
		if (Double.doubleToLongBits(batAve) != Double.doubleToLongBits(other.batAve))
			return false;
		if (debutDate == null) {
			if (other.debutDate != null)
				return false;
		} else if (!debutDate.equals(other.debutDate))
			return false;
		if (playerId != other.playerId)
			return false;
		if (recordId != other.recordId)
			return false;
		if (recordName == null) {
			if (other.recordName != null)
				return false;
		} else if (!recordName.equals(other.recordName))
			return false;
		if (runs != other.runs)
			return false;
		if (totalGame != other.totalGame)
			return false;
		return true;
	}

}
