package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.pojo.SMSPlayer;

@Repository
public class SMSPlayerDaoImpl implements SMSPlayerDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public SMSPlayer addSMSPlayer(SMSPlayer smsPlayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSMSPlayer(SMSPlayer smsPlayer) {
		// TODO Auto-generated method stub

	}

	@Override
	public SMSPlayer updateSMSPlayer(SMSPlayer smsPlayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSPlayer> getAllSMSPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSPlayer getSMSPlayerById(int playerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSPlayer getSMSPlayerByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSPlayer> getAllSMSPlayerByTeamId(int teamID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSPlayer> getAllSMSPlayerByTeam(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSPlayer> getAllSMSPlayerByTournamentId(int tournamentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSPlayer> getAllSMSPlayerByTournament(String tournamentName) {
		// TODO Auto-generated method stub
		return null;
	}

}
