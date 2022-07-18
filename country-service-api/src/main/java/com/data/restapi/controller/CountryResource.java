package com.data.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.restapi.dto.RequestVO;
import com.data.restapi.entity.Country;
import com.data.restapi.service.CommonService;

@RestController
@RequestMapping("/api")
public class CountryResource {

	@Autowired
	private CommonService commonService;
	
	@PostMapping("/createCountry")
	public Country createCountry(@RequestBody RequestVO request){
		return commonService.save(request.getCountry());
		
	}
	
	@GetMapping("/getCountries")
	public List<Country> getCountries(){
		return commonService.getCountries();
	}
	
	@GetMapping("/getCountry/{id}")
	public List<Country> getCountry(@PathVariable Long id){
		return commonService.getCountryById(id);
	}
	
}
