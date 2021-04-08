package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSPlayer;

@Component
public class SMSPlayerExtractor implements ResultSetExtractor<SMSPlayer> {

	@Override
	public SMSPlayer extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		int playerID = rs.getInt("player_id");
		int webUserId = rs.getInt("web_user_id");
		String userName = rs.getString("user_name");
		String playerBatStyle = rs.getString("player_batstyle");
		String playerBowlStyle = rs.getString("player_bowlstyle");
		int teamId = rs.getInt("team_id");
		int tournamentId = rs.getInt("tournament_id");
		
		return new SMSPlayer(playerID, webUserId, userName, playerBatStyle, playerBowlStyle, teamId, tournamentId);
	}

}
