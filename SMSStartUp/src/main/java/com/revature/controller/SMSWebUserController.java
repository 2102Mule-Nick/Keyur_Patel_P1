package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.SMSWebUser;
import com.revature.service.SMSWebUserService;

@RestController
public class SMSWebUserController {

	SMSWebUserService smsWebUserService;

	@Autowired
	public void setSmsWebUserService(SMSWebUserService smsWebUserService) {
		this.smsWebUserService = smsWebUserService;
	}
	
	@GetMapping("/smsWebUser")
	public List<SMSWebUser> getAllSMSWebUser() {
		return smsWebUserService.retrieveAllSMSWebUser();
	}
	
}
