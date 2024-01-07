package com.eazybytes.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.accounts.entity.CustomerEntity;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {

}
