package com.eazybytes.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class AccountsEntity extends BaseEntity {
	private Long customerId;
	@Id
	private String accountNumber;
	private String accountType;
	private String branchAddress;
	private String mobileNumber;
}
