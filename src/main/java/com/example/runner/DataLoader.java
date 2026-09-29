package com.example.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.entity.CitizenPlan;
import com.example.repo.CitizenPlanRepo;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataLoader implements ApplicationRunner{
	@Autowired
private CitizenPlanRepo repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.deleteAll();
		log.info("1003 run method started");
		// TODO Auto-generated method stub
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("john");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.0);
		
		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		
		CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("Catchy");
		c3.setGender("FeMale");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setTerminationReason("Employed");
		//food plan data
		CitizenPlan c4=new CitizenPlan();
		c4.setCitizenName("David");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setTerminationReason("Employed");
		c4.setBenefitAmt(5000.00);
		
		
		CitizenPlan c5=new CitizenPlan();
		c5.setCitizenName("Robert");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Approved");
		c5.setBenefitAmt(5000.00);
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		
		
		
		CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Orlen");
		c6.setGender("FeMale");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now());
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationReason("Employed");
		
		
		
		//Medical plan
		CitizenPlan c7=new CitizenPlan();
		c7.setCitizenName("Charles");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
	
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(5000.00);
	
		
		CitizenPlan c8=new CitizenPlan();
		c8.setCitizenName("Charles");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
	
		c8.setDenialReason("property income");
	
		
		CitizenPlan c9=new CitizenPlan();
		c9.setCitizenName("Morish");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("terminated");
	
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationReason("employed");
	
		
		CitizenPlan c10=new CitizenPlan();
		c10.setCitizenName("Nilam");
		c10.setGender("FeMale");
		c10.setPlanName("Medical");
		c10.setPlanStatus("Approved");
	c10.setBenefitAmt(5000.00);
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		
		
		List<CitizenPlan> asList = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10);
		log.info("1001 asList: {}",asList);
	List<CitizenPlan> saveAll = repo.saveAll(asList);
	log.info("1002 asList: {}",saveAll);
	}

}
