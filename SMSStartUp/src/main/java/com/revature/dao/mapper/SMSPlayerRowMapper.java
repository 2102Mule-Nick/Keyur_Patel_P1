package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSPlayer;

@Component
public class SMSPlayerRowMapper implements RowMapper<SMSPlayer> {

	private SMSPlayerExtractor smsPlayerExtractor;
	
	@Autowired
	public void setSmsPlayerExtractor(SMSPlayerExtractor smsPlayerExtractor) {
		this.smsPlayerExtractor = smsPlayerExtractor;
	}



	@Override
	public SMSPlayer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		return smsPlayerExtractor.extractData(rs);
	}

}
