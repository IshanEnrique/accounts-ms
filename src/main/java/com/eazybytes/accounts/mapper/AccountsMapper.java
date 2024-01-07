package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.entity.AccountsEntity;
import org.springframework.stereotype.Component;

@Component
public class AccountsMapper {
	public void mapToAccountsDto(AccountsEntity accountsEntity ,AccountsDto accountsDto){
		accountsDto.setAccountNumber(accountsEntity.getAccountNumber());
		accountsDto.setAccountType(accountsEntity.getAccountType());
		accountsDto.setBranchAddress(accountsEntity.getBranchAddress());
	}
	public void mapToAccounts(AccountsDto accountsDto,AccountsEntity accountsEntity){
		accountsEntity.setAccountNumber(accountsDto.getAccountNumber());
		accountsEntity.setAccountType(accountsDto.getAccountType());
		accountsEntity.setBranchAddress(accountsDto.getBranchAddress());
	}
}
