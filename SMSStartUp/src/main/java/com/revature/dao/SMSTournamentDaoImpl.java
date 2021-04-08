package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.pojo.SMSTournament;

@Repository
public class SMSTournamentDaoImpl implements SMSTournamentDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public SMSTournament addSMSTournament(SMSTournament smsTournament) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSMSTournament(SMSTournament smsTournament) {
		// TODO Auto-generated method stub

	}

	@Override
	public SMSTournament updateSMSTournament(SMSTournament smsTournament) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSTournament> getAllSMSTournament() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSTournament getSMSTournamentById(int tournamentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSTournament getSMSTournamentByName(String tournamentName) {
		// TODO Auto-generated method stub
		return null;
	}

}
