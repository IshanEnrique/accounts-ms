package com.eazybytes.accounts.helper;

import com.eazybytes.accounts.constants.Constants;
import com.eazybytes.accounts.entity.AccountsEntity;
import com.eazybytes.accounts.entity.CustomerEntity;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CommonHelper {
	public static String getNewAccountNumber(){
		long accountNumber=1000000000L+new Random().nextInt(900000000);
		return String.valueOf(accountNumber);
	}
	public static AccountsEntity createNewAccount(CustomerEntity customerEntity){
		return AccountsEntity.build(customerEntity.getCustomerId(),getNewAccountNumber(), Constants.SAVINGS.getValue(), Constants.BRANCH_ADDRESS.getValue(),customerEntity.getMobileNumber());
	}
}
