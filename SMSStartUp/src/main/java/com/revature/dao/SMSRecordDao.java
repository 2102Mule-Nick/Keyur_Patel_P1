package com.revature.dao;

import java.util.List;

import com.revature.pojo.SMSRecord;

public interface SMSRecordDao {
	
public SMSRecord addSMSRecord (SMSRecord smsRecord);
	
	public void deleteSMSRecord (SMSRecord smsRecord);
	
	public SMSRecord updateSMSRecord (SMSRecord smsRecord);
	
	public List<SMSRecord> getAllSMSRecord();
	
	public SMSRecord getSMSRecordById(int recordID);
	
	public SMSRecord getSMSRecordByPlayerId(int playerId);
	
	public List<SMSRecord> getAllSMSRecordByTeamId(int teamID);
	
	public List<SMSRecord> getAllSMSRecordByTeam(String teamName);
	
	public List<SMSRecord> getAllSMSRecordByTournamentId(int tournamentID);
	
	public List<SMSRecord> getAllSMSRecordByTournament(String tournamentName);

}
