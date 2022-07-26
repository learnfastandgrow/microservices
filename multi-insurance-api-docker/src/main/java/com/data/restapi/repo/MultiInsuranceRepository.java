package com.data.restapi.repo;

import org.springframework.stereotype.Repository;

import com.data.restapi.model.InsuranceEnum;
import com.data.restapi.model.ResponseVO;

@Repository
public class MultiInsuranceRepository {
	
	public ResponseVO getAutoQuote() {

		ResponseVO responseVO = new ResponseVO();
		responseVO.setAmount(560.00);
		responseVO.setType(InsuranceEnum.AUTO.toString());
		responseVO.setStatus("pending");
		
		return responseVO;
		
	}
	
	public ResponseVO getHomeQuote() {

		ResponseVO responseVO = new ResponseVO();
		responseVO.setAmount(750.00);
		responseVO.setType(InsuranceEnum.HOME.toString());
		responseVO.setStatus("Pending");
		
		return responseVO;
		
	}

	
}
