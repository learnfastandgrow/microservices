package com.data.restapi.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.data.restapi.model.Address;
import com.data.restapi.model.ResponseVO;

@Service
public class AddressService {

	Map<String, Address> addressMap = new HashMap<>();
	
	public ResponseVO createAddress(String user, Address address){
		ResponseVO responseVO = new ResponseVO();
		addressMap.put(user, address);
		String homeAddress = address.getStreet1()+" ,"+address.getState()+", "+address.getZip();
		responseVO.setUserid(user);
		responseVO.setAddress(homeAddress);
		return responseVO;
	}

	public Address getAddressforUser(String userId) {
		return addressMap.get(userId);
	}
}
