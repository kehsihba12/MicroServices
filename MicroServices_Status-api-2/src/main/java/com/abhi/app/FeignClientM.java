package com.abhi.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(name = "GREET-API")
public interface FeignClientM {
	
  @GetMapping("/greet")
  public String invokeGreetApi();
}
