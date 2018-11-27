package com.qa.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.AccountConstants;

@RestController
public class ConsumeAccountNumber implements IConsumeAccNums {
	
	   @Autowired
	   RestTemplate restTemplate;

	   @RequestMapping(value = AccountConstants.CALL_ACCOUNT_NUMBER_PATH)
	   public String getAccountNumber() {	      
	      return restTemplate.getForObject(AccountConstants.GET_ACCOUNT_NUMBER_PATH,String.class);
	   }

}
