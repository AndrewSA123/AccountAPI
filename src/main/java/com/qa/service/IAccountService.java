package com.qa.service;

import java.util.Collection;

import com.qa.persistence.domain.Account;

public interface IAccountService {

	public String createAccount(String firstName, String lastName, String accountType);

	public String deleteAccount(Long id);

	public Account updateAccount(Long id, Account account);

	public Account findAccount(Long id);

	public Collection<Account> getAllAccounts();

}
