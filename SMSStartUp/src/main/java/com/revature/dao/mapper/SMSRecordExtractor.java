package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSRecord;

@Component
public class SMSRecordExtractor implements ResultSetExtractor<SMSRecord> {

	@Override
	public SMSRecord extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		int recordId = rs.getInt("record_id");
		String recordName = rs.getString("record_name");
		int totalGame = rs.getInt("total_game");
		int runs = rs.getInt("runs");
		double batAve = rs.getDouble("bat_ave");
		String debutDate = rs.getString("debut_date");
		int playerId = rs.getInt("player_id");

		return new SMSRecord(recordId, recordName, totalGame, runs, batAve, debutDate, playerId);
	}

}
