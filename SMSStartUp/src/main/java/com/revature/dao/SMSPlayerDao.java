package com.revature.dao;

import java.util.List;

import com.revature.pojo.SMSPlayer;

public interface SMSPlayerDao {

	public SMSPlayer addSMSPlayer (SMSPlayer smsPlayer);
	
	public void deleteSMSPlayer (SMSPlayer smsPlayer);
	
	public SMSPlayer updateSMSPlayer (SMSPlayer smsPlayer);
	
	public List<SMSPlayer> getAllSMSPlayer();
	
	public SMSPlayer getSMSPlayerById(int playerID);
	
	public SMSPlayer getSMSPlayerByUserName(String userName);
	
	public List<SMSPlayer> getAllSMSPlayerByTeamId(int teamID);
	
	public List<SMSPlayer> getAllSMSPlayerByTeam(String teamName);
	
	public List<SMSPlayer> getAllSMSPlayerByTournamentId(int tournamentID);
	
	public List<SMSPlayer> getAllSMSPlayerByTournament(String tournamentName);
	
	
}
