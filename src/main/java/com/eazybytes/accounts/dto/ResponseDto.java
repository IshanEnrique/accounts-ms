package com.eazybytes.accounts.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ResponseDto {
	private String status;
	private List<String> messages;
}
