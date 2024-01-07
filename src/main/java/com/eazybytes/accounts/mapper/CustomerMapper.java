package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.AccountsEntity;
import com.eazybytes.accounts.entity.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
	public void mapToCustomerDto(CustomerEntity customerEntity , CustomerDto customerDto){
		customerDto.setName(customerEntity.getName());
		customerDto.setEmail(customerEntity.getEmail());
		customerDto.setMobileNumber(customerEntity.getMobileNumber());
	}
	public void mapToCustomer(CustomerDto customerDto,CustomerEntity customerEntity){
		customerEntity.setName(customerDto.getName());
		customerEntity.setEmail(customerDto.getEmail());
		customerEntity.setMobileNumber(customerDto.getMobileNumber());
	}
}
