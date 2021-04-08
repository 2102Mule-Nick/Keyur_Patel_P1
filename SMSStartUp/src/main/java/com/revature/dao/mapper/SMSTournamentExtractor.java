package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSTournament;

@Component
public class SMSTournamentExtractor implements ResultSetExtractor<SMSTournament> {

	@Override
	public SMSTournament extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		int tournamentId = rs.getInt("tournament_id");
		String tournamentName = rs.getString("tournament_name");
		
		return new SMSTournament(tournamentId, tournamentName);
	}

}
