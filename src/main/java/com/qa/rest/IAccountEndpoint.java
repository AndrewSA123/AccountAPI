package com.qa.rest;

import java.util.Collection;

import com.qa.persistence.domain.Account;

public interface IAccountEndpoint {

	public Collection<Account> getAllAccounts();

	public Account findAccount(Long id);

	public String createAccount(Account account);

	public String updateAccount(Long id, Account account);

	public String deleteAccount(Long id);

}
