package com.uninorte.distributed.programming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IntegrationController {
	private Logger logger = LoggerFactory.getLogger(IntegrationController.class);
	
	@Autowired
	private UserManagementServiceProxy userManagementServiceProxy;
	
	@GetMapping(path = "/integration/get/user/{user_id}")
	public User getUserInformation(@PathVariable int user_id) {
		logger.info("getUserInformation was called");
		return userManagementServiceProxy.getUser("APP-CODE;UNIX-TS;UNIQ-TOKEN;", user_id);
	}

}
