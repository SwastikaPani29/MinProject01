package com.example.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.entity.CitizenPlan;
import com.example.repo.CitizenPlanRepo;
import com.example.request.SearchRequest;
@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
private CitizenPlanRepo planRepo;
	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub
		List<String> planNameCol = planRepo.getPlanNames();
		return planNameCol;
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return planRepo.getPlanStaus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		CitizenPlan cp=new CitizenPlan();
		BeanUtils.copyProperties(request, cp);
		// TODO Auto-generated method stub
		List<CitizenPlan> searchResult = planRepo.findAll(Example.of(cp));
		//select * from citizen_plan where planName= :? and 
		return searchResult;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportOdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
