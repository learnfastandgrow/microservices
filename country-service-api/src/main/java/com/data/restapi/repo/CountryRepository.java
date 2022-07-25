package com.data.restapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.restapi.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

	/*
	 * @Query(value= "SELECT * from countries c where c.id= ?", nativeQuery = true)
	 * List<Country> getStatesByCountryId(Long id);
	 */

	List<Country> getCountryById(Long id);
	
}
