package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.SMSWebUserDao;
import com.revature.pojo.SMSWebUser;

@Service
public class SMSWebUserServiceImpl implements SMSWebUserService {

	private SMSWebUserDao smsWebUserDao;
	
	@Autowired
	public void setSmsWebUserDao(SMSWebUserDao smsWebUserDao) {
		this.smsWebUserDao = smsWebUserDao;
	}

	@Override
	public List<SMSWebUser> retrieveAllSMSWebUser() {
		// TODO Auto-generated method stub
		
		// Business Logic will go here.
		
		return smsWebUserDao.getAllSMSWebUser();
	}

}
