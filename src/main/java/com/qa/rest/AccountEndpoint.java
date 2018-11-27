package com.qa.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Account;
import com.qa.service.IAccountService;

@RequestMapping("/account")
@RestController
public class AccountEndpoint implements IAccountEndpoint {

	@Autowired
	private IAccountService service;

	@Override
	@GetMapping("/getall")
	public Iterable<Account> getAllAccounts() {
		return service.getAllAccounts();
	}

	@Override
	@GetMapping("/find/{id}")
	public Optional<Account> findAccount(@PathVariable Long id) {
		return service.findAccount(id);
	}

	@Override
	@PostMapping("/create")
	public Account createAccount(@RequestBody Account account) {
		return service.createAccount(account);
	}


	@Override
	@DeleteMapping("/delete/{id}")
	public String deleteAccount(@PathVariable Long id) {
		return service.deleteAccount(id);
	}

}
