package com.data.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestVO {
	
	private String id;
	private String fname;
	private String lname;
	private String dob;
	private String zipcode;

}
