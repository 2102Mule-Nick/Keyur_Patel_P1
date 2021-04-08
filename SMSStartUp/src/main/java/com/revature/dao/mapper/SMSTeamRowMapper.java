package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSTeam;

@Component
public class SMSTeamRowMapper implements RowMapper<SMSTeam> {
	
	private SMSTeamExtractor smsTeamExtractor;
	
	@Autowired
	public void setSmsTeamExtractor(SMSTeamExtractor smsTeamExtractor) {
		this.smsTeamExtractor = smsTeamExtractor;
	}


	@Override
	public SMSTeam mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return smsTeamExtractor.extractData(rs);
	}

}
