package com.eazybytes.accounts.dto;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ErrorResonseDto {
	private String apiPath;
	private HttpStatus errorCode;
	private List<String> errorMessages;
	private LocalDateTime errorTime;
}
