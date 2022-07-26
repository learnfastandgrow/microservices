package com.data.restapi.service;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.restapi.exception.BusinessException;
import com.data.restapi.model.InsuranceEnum;
import com.data.restapi.model.RequestVO;
import com.data.restapi.model.ResponseVO;
import com.data.restapi.repo.MultiInsuranceRepository;

@Service
public class MultiInsuranceServiceImpl implements MultiInsuranceService {
	
	@Autowired
	private MultiInsuranceRepository  multiInsuranceRepo;

	@Override
	public List<String> getInsuranceType() {
		List<String> insurTypes = EnumSet.allOf(InsuranceEnum.class).stream().map(e->e.name()).collect(Collectors.toList());
		return insurTypes;
	}

	@Override
	public ResponseVO getQuote(RequestVO requestVO) throws BusinessException {
		if(requestVO != null) {
			if(requestVO.getId() != null && "AUTO".equals(requestVO.getId())) {
				return multiInsuranceRepo.getAutoQuote();
			}else if(requestVO.getId() != null && "HOME".equals(requestVO.getId())) {
				return multiInsuranceRepo.getHomeQuote();
			}else {
				throw new BusinessException("Insurance Not available");
			}
		}
		return null;
	}



}
