package com.data.restapi.service;

import java.util.List;

import com.data.restapi.exception.BusinessException;
import com.data.restapi.model.RequestVO;
import com.data.restapi.model.ResponseVO;

public interface MultiInsuranceService {
	
	public List<String> getInsuranceType();
	
	public ResponseVO getQuote(RequestVO requestVO) throws BusinessException;
}
