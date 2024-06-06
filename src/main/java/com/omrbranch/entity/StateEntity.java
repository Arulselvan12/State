package com.omrbranch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STATELIST")

public class StateEntity {
	
	@Id
	@Column(name = "STATEID")
	private int stateId;
	@Column(name = "STATENAME")
	private String stateName;

}
