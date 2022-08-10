package com.data.restapi.service;

import com.data.restapi.exception.BusinessException;
import com.data.restapi.model.RequestVO;
import com.data.restapi.model.ResponseVO;

public interface AutoInsuranceService {
	
	public ResponseVO getQuote(RequestVO requestVO) throws BusinessException;
}
