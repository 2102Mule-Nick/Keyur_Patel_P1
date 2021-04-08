package com.revature.dao;

import java.util.List;

import com.revature.pojo.SMSTeam;

public interface SMSTeamDao {
	
	public SMSTeam addSMSTeam(SMSTeam smsTeam);
	
	public void deleteSMSTeam(SMSTeam smsTeam);
	
	public SMSTeam updateSMSTeam(SMSTeam smsTeam);
	
	public List<SMSTeam> getAllSMSTeam();
	
	public SMSTeam getSMSTeamById(int teamId);
	
	public SMSTeam getSMSTeamByName(String teamName);
}
