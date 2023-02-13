package com.uninorte.distributed.programming;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "user-management-service")
public interface UserManagementServiceProxy {

	@GetMapping(path = "/user/get/{user_id}")
	public User getUser(@RequestHeader(name = "Authorization",defaultValue = "APP-CODE;UNIXTIMESTAMP;UNIQ-TOKEN") String authorization,@PathVariable int user_id);
}
