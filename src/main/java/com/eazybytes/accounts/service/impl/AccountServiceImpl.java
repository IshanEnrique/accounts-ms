package com.eazybytes.accounts.service.impl;

import com.eazybytes.accounts.constants.Constants;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.CustomerEntity;
import com.eazybytes.accounts.exceptions.CustomerAlreadyExistsException;
import com.eazybytes.accounts.helper.CommonHelper;
import com.eazybytes.accounts.mapper.AccountsMapper;
import com.eazybytes.accounts.mapper.CustomerMapper;
import com.eazybytes.accounts.repository.AccountsRepo;
import com.eazybytes.accounts.repository.CustomerRepo;
import com.eazybytes.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private AccountsRepo accountsRepo;
	@Autowired
	private AccountsMapper accountsMapper;
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public void createAccount(CustomerDto customerDto) {
		Optional<CustomerEntity> existsCustomer=customerRepo.findByMobileNumber(customerDto.getMobileNumber());
		if(existsCustomer.isEmpty()){
			new CustomerAlreadyExistsException(Constants.ALREADY_EXISTS.getValue());
		}
		CustomerEntity customer=new CustomerEntity();
		customerMapper.mapToCustomer(customerDto,customer);
		CustomerEntity savedCustomer=customerRepo.save(customer);
		accountsRepo.save(CommonHelper.createNewAccount(savedCustomer));

	}

}
