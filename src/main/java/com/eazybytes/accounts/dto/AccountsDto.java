package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class AccountsDto {
	private Long customerId;
	private String accountNumber;
	private String accountType;
	private String branchAddress;
}
