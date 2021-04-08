package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSWebUser;

@Component
public class SMSWebUserRowMapper implements RowMapper<SMSWebUser> {
	
	private SMSWebUserExtractor smsWebUserExtractor;
	
	@Autowired
	public void setSmsWebUserExtractor(SMSWebUserExtractor smsWebUserExtractor) {
		this.smsWebUserExtractor = smsWebUserExtractor;
	}



	@Override
	public SMSWebUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return smsWebUserExtractor.extractData(rs);
	}

}
