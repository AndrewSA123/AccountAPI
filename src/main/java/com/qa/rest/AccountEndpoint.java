package com.qa.rest;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Account;

@RequestMapping("/account")
@RestController
public class AccountEndpoint implements IAccountEndpoint {

	@Override
	@GetMapping("/getall")
	public Collection<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/find/{id}")
	public Account findAccount(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PostMapping("/create")
	public String createAccount(@RequestBody Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PutMapping("/update/{id}")
	public String updateAccount(@PathVariable Long id, @RequestBody Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DeleteMapping("/delete/{id}")
	public String deleteAccount(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
