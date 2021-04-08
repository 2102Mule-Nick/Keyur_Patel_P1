package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.dao.mapper.SMSWebUserRowMapper;
import com.revature.pojo.SMSWebUser;

@Repository
public class SMSWebUserDaoImpl implements SMSWebUserDao {

	private JdbcTemplate jdbcTemplate;
	
	private SMSWebUserRowMapper smsWebUserRowMapper;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	public void setSmsWebUserRowMapper(SMSWebUserRowMapper smsWebUserRowMapper) {
		this.smsWebUserRowMapper = smsWebUserRowMapper;
	}



	@Override
	public SMSWebUser addSMSWebUser(SMSWebUser smsWebUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSMSWebUser(SMSWebUser smsWebUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public SMSWebUser updateSMSWebUser(SMSWebUser smsWebUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SMSWebUser> getAllSMSWebUser() {
		// TODO Auto-generated method stub
		
		String sql = "select * from web_user;";
		
		List<SMSWebUser> smsWebUserList = jdbcTemplate.query(sql, smsWebUserRowMapper);
		
		return smsWebUserList;
	}

	@Override
	public SMSWebUser getSMSWebUserById(int webUserID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SMSWebUser getSMSWebUserByEmail(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}

}
