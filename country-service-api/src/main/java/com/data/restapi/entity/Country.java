package com.data.restapi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="countries")
public class Country {

	@Id
	private Long id;
	
	@NotNull
	private String countryName;
	
	@OneToMany(targetEntity = State.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "country_fk", referencedColumnName = "id")
	private List<State> states;
	
	
}
