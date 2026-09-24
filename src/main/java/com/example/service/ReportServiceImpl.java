package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		return planRepo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return planRepo.getPlanStaus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
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
