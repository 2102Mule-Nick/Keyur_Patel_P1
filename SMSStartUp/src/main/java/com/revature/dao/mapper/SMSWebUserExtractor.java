package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.SMSWebUser;

@Component
public class SMSWebUserExtractor implements ResultSetExtractor<SMSWebUser> {

	@Override
	public SMSWebUser extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		int webUserID = rs.getInt("web_user_id");
		String userEmail = rs.getString("user_email");
		String userPassword = rs.getString("user_password");
		String birthdate = rs.getString("birthdate");
		double membershipFee = rs.getDouble("membership_fee");
		
		return new SMSWebUser(webUserID, userEmail, userPassword, birthdate, membershipFee);
	}

}
