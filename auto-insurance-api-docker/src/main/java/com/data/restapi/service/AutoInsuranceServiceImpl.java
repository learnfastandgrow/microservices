package com.data.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.restapi.exception.BusinessException;
import com.data.restapi.model.RequestVO;
import com.data.restapi.model.ResponseVO;
import com.data.restapi.repo.AutoInsuranceRepository;

@Service
public class AutoInsuranceServiceImpl implements AutoInsuranceService {
	
	@Autowired
	private AutoInsuranceRepository  autoInsuranceRepo;

	
	@Override
	public ResponseVO getQuote(RequestVO requestVO) throws BusinessException {
		if(requestVO != null) {
			if(requestVO != null) {
				return autoInsuranceRepo.getAutoQuote(requestVO.getVechileType());
			}
		}
		return null;
	}
}
