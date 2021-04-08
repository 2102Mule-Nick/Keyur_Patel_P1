package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.pojo.SMSTeam;

@Repository
public class SMSTeamDaoImpl implements SMSTeamDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public SMSTeam addSMSTeam(SMSTeam smsTeam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSMSTeam(SMSTeam smsTeam) {
		// TODO Auto-generated method stub

	}

	@Override
	public SMSTeam updateSMSTeam(SMSTeam smsTeam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSTeam> getAllSMSTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSTeam getSMSTeamById(int teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSTeam getSMSTeamByName(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

}
