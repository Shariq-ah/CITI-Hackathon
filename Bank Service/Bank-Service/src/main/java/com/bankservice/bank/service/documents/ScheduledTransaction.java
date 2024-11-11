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
public class ScheduledTransaction {
	
	@Id
	private int transactionId;
	@Getter @Setter double amount;
	@Getter @Setter private Long sourceAccount;
	@Getter @Setter private Long destinationAccount;
	@Getter @Setter private Date scheduledDateTime;
	@Getter @Setter private String transactioStatus;

}
