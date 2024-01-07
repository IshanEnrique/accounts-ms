package com.eazybytes.accounts.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum Constants {
	ALREADY_EXISTS(""),BRANCH_ADDRESS("630 Mamura Gali No 5 , Sector 66 , Noida U.P. 201301"),SAVINGS("Savings"),STATUS_201("201"),MESSAGE_201("Account created"),STATUS_200("200"),MESSAGE_200("Request processed successfully");
	private String value;
}
