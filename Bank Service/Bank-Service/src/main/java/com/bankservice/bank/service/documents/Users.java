package com.bankservice.bank.service.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	
	@Id
	private String userId;
	@Getter @Setter String name;
	@Getter @Setter private String email;
	@Getter @Setter private String phone;
	@Getter @Setter private String address;
	@Getter @Setter private String gender;
}
