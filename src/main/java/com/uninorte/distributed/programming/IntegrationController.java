package com.uninorte.distributed.programming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegrationController {
	
	@Autowired
	private UserManagementServiceProxy userManagementServiceProxy;
	
	@GetMapping(path = "/integration/get/user/{user_id}")
	public User getUserInformation(@PathVariable int user_id) {
		return userManagementServiceProxy.getUser("APP-CODE;UNIX-TS;UNIQ-TOKEN;", user_id);
	}

}
