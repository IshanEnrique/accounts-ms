package com.eazybytes.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.accounts.entity.AccountsEntity;

@Repository
public interface AccountsRepo extends JpaRepository<AccountsEntity, Long> {

}
