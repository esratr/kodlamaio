package com.hrms.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstratcs.JobPositionService;
import com.hrms.hrms.entities.concretes.JobPosition;


@RestController

@RequestMapping("/api/jobpositions")
public class JobPositionController {
	
	
	private JobPositionService jobPositionsService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}

	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionsService.getAll();
	}

}
