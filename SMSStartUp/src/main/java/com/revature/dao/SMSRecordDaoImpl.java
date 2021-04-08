package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.pojo.SMSRecord;

@Repository
public class SMSRecordDaoImpl implements SMSRecordDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public SMSRecord addSMSRecord(SMSRecord smsRecord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSMSRecord(SMSRecord smsRecord) {
		// TODO Auto-generated method stub

	}

	@Override
	public SMSRecord updateSMSRecord(SMSRecord smsRecord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSRecord> getAllSMSRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSRecord getSMSRecordById(int recordID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSRecord getSMSRecordByPlayerId(int playerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSRecord> getAllSMSRecordByTeamId(int teamID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSRecord> getAllSMSRecordByTeam(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSRecord> getAllSMSRecordByTournamentId(int tournamentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSRecord> getAllSMSRecordByTournament(String tournamentName) {
		// TODO Auto-generated method stub
		return null;
	}

}
