package com.data.restapi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="states")
public class State {
	
	@Id
	@GeneratedValue
	private Long stateId;
	
	private String name;
	
	@OneToMany(targetEntity = County.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "state_fk", referencedColumnName = "stateId")
	private List<County> counties;


}
