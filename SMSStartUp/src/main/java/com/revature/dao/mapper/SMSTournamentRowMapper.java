package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSTournament;

@Component
public class SMSTournamentRowMapper implements RowMapper<SMSTournament> {

	private SMSTournamentExtractor smsTournamentExtractor;
	
	@Autowired
	public void setSmsTournamentExtractor(SMSTournamentExtractor smsTournamentExtractor) {
		this.smsTournamentExtractor = smsTournamentExtractor;
	}



	@Override
	public SMSTournament mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return smsTournamentExtractor.extractData(rs);
	}

}
