package com.bankservice.bank.service.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {
	
	@Id
	private int accountId;
	private int userId;
	private Long accountNumber;
	private double balance;
	private String accountType;
	private Date accountCreationdate;

}
