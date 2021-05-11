package com.hrms.hrms.entities.concretes;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name="job_position")


public class JobPosition {
	

	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="positions")
	private String position;
	
	
//	public JobPositions() {
//		super();
//	}
//
//	public JobPositions(int id, String position) {
//		super();
//		this.id = id;
//		this.position = position;
//	}



}
