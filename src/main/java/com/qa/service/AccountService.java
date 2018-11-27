package com.qa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.constants.AccountConstants;
import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.IAccountRepo;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private IAccountRepo repo;

	@Override
	public Account createAccount(Account account) {
		return repo.save(account);
	}

	@Override
	public String deleteAccount(Long id) {
		repo.deleteById(id);
		return AccountConstants.DELETE_ACCOUNT;
	}


	@Override
	public Optional<Account> findAccount(Long id) {

		return repo.findById(id);
	}

	@Override
	public Iterable<Account> getAllAccounts() {
		return repo.findAll();
	}

}
