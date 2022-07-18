package com.data.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

	private String street1;
	
	private String street2;
	
	private Long zip;
	
	private String state;
	
	private String country;
}
