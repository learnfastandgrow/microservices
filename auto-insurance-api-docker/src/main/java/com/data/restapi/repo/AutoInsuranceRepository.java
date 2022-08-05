package com.data.restapi.repo;

import org.springframework.stereotype.Repository;

import com.data.restapi.model.ResponseVO;
import com.data.restapi.service.VechileEnum;

@Repository
public class AutoInsuranceRepository {
	
	public ResponseVO getAutoQuote(String vechileType) {

		ResponseVO responseVO = new ResponseVO();
		if(vechileType.equalsIgnoreCase("SUV")){
			responseVO.setQuote(VechileEnum.SUV.getQuote());
		}else if(vechileType.equalsIgnoreCase("TRUCK")){
			responseVO.setQuote(VechileEnum.TRUCK.getQuote());
		}else if(vechileType.equalsIgnoreCase("SEDAN")){
			responseVO.setQuote(VechileEnum.SEDAN.getQuote());
		}else {
			responseVO.setQuote(VechileEnum.OTHER.getQuote());
		}
		responseVO.setType(vechileType);
		return responseVO;
	}
	
}
