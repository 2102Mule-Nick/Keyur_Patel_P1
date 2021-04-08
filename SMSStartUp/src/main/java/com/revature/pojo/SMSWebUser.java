package com.revature.pojo;

public class SMSWebUser {
	
	public int webUserID;
	
	public String userEmail;
	
	public String userPassword;
	
	public String Birthdate;
	
	public double membershipFee;

	public int getWebUserID() {
		return webUserID;
	}

	public void setWebUserID(int webUserID) {
		this.webUserID = webUserID;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}

	public double getMembershipFee() {
		return membershipFee;
	}

	public void setMembershipFee(double membershipFee) {
		this.membershipFee = membershipFee;
	}

	public SMSWebUser(int webUserID, String userEmail, String userPassword, String birthdate, double membershipFee) {
		super();
		this.webUserID = webUserID;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		Birthdate = birthdate;
		this.membershipFee = membershipFee;
	}

	public SMSWebUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SMSWebUser [webUserID=" + webUserID + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", Birthdate=" + Birthdate + ", membershipFee=" + membershipFee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Birthdate == null) ? 0 : Birthdate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(membershipFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + webUserID;
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
		SMSWebUser other = (SMSWebUser) obj;
		if (Birthdate == null) {
			if (other.Birthdate != null)
				return false;
		} else if (!Birthdate.equals(other.Birthdate))
			return false;
		if (Double.doubleToLongBits(membershipFee) != Double.doubleToLongBits(other.membershipFee))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (webUserID != other.webUserID)
			return false;
		return true;
	}

}
