package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSTeam;

@Component
public class SMSTeamExtractor implements ResultSetExtractor<SMSTeam> {

	@Override
	public SMSTeam extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		int teamId = rs.getInt("team_id");
		String teamName = rs.getString("team_name");
		return new SMSTeam(teamId, teamName);
	}

}
