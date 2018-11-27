package com.qa.webservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.AccountConstants;

@RestController
public class ConsumePrizeGenerator implements IConsumePrizeGenerator {
	
	  @Autowired
	   RestTemplate restTemplate;

	   @RequestMapping(value = AccountConstants.CALL_PRIZE_PATH+"/{accountNumber}")
	   public String getPrize(@PathVariable String accountNumber) {      
	      return restTemplate.getForObject(AccountConstants.GET_PRIZE_PATH+"/"+accountNumber,String.class);
	   }

}
