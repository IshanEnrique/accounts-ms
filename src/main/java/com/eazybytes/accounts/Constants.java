package com.eazybytes.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum Constants {
	SAVINGS("Savings"),STATUS_201("201"),MESSAGE_201("Account created"),STATUS_200("200"),MESSAGE_200("Request processed successfully");
	private String value;
}
