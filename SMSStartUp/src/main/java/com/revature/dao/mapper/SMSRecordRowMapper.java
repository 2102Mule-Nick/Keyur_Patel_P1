package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSRecord;

@Component
public class SMSRecordRowMapper implements RowMapper<SMSRecord> {

	private SMSRecordExtractor smsRecordExtractor;
	
	@Autowired
	public void setSmsRecordExtractor(SMSRecordExtractor smsRecordExtractor) {
		this.smsRecordExtractor = smsRecordExtractor;
	}



	@Override
	public SMSRecord mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub		
		return smsRecordExtractor.extractData(rs);
	}

}
