package com.qa.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.qa.persistence.domain.Account;

public interface IAccountRepo extends CrudRepository<Account, Long> {

}
