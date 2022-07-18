package com.data.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.restapi.model.Address;
import com.data.restapi.model.RequestVO;
import com.data.restapi.model.ResponseVO;
import com.data.restapi.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressResource {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/createAddress")
	public ResponseVO saveAddress(@RequestBody RequestVO rVo){
		if(rVo != null) {
			 return addressService.createAddress(rVo.getUserId(), rVo.getAddress());
		}
		return null;
	}

	@PostMapping("/getAddress")
	public Address getAddressforUser(@RequestBody RequestVO rVo ) {
		if(rVo.getUserId() != null) {
			return addressService.getAddressforUser(rVo.getUserId());
		}
		return null;
	}
	
}
