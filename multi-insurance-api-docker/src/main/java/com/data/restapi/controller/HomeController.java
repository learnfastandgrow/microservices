package com.data.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.restapi.exception.BusinessException;
import com.data.restapi.model.RequestVO;
import com.data.restapi.model.ResponseVO;
import com.data.restapi.service.MultiInsuranceServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
	
	@Autowired
	private MultiInsuranceServiceImpl multiInsuranceService;
	
	@GetMapping("/")
	@ResponseBody
	public List<String> getInsuranceType(){
		return multiInsuranceService.getInsuranceType(); 
		
	}
	
	@PostMapping("/getQuote")
	public ResponseVO getQuote(@RequestBody RequestVO requestVO) throws BusinessException{
		return multiInsuranceService.getQuote(requestVO); 
	}

}
