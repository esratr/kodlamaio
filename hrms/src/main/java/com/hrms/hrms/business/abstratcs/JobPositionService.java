package com.hrms.hrms.business.abstratcs;

import java.util.List;

import com.hrms.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();

}
