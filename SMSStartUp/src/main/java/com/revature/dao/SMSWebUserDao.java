package com.revature.dao;

import java.util.List;

import com.revature.pojo.SMSWebUser;

public interface SMSWebUserDao {

	public SMSWebUser addSMSWebUser(SMSWebUser smsWebUser);

	public void deleteSMSWebUser(SMSWebUser smsWebUser);

	public SMSWebUser updateSMSWebUser(SMSWebUser smsWebUser);

	public List<SMSWebUser> getAllSMSWebUser();

	public SMSWebUser getSMSWebUserById(int webUserID);

	public SMSWebUser getSMSWebUserByEmail(String userEmail);
	

}
