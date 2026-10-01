package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.CitizenPlan;
import com.example.request.SearchRequest;
import com.example.service.ReportService;

@Controller
public class ReportController {
	@Autowired
private ReportService service;
	@PostMapping("/search")
	public String handleSearchReq(@ModelAttribute("search")SearchRequest request,Map<String,Object> map) {
		System.out.println(request);
		System.out.println("search methd is executed");
		List<CitizenPlan> searchResult = service.search(request);
		//model.addAttribute("plan",plans);
		map.put("searchResult", searchResult);
		SearchRequest searchObj=new SearchRequest();
		init(map, searchObj);
		/*map.put("search", searchObj);
		List<String> planNameList = service.getPlanNames();
		map.put("names", planNameList);
		//model.addAttribute("status", service.getPlanStatus());
		map.put("status", service.getPlanStatus());*/
		return "index1";
		
	}

	@GetMapping("/")
	public String indexPage(Map<String,Object> map) {
		SearchRequest searchObj=new SearchRequest();
		//init(map, searchObj);
		map.put("search", searchObj);
		List<String> planNameList = service.getPlanNames();
		map.put("names", planNameList);
		//model.addAttribute("status", service.getPlanStatus());
		map.put("status", service.getPlanStatus());
		return "index1";
		}
	private void init(Map<String,Object> map, SearchRequest searchObj) {
		List<String> planNameList = service.getPlanNames();
		//model.addAttribute("search", searchObj);
		map.put("search", searchObj);
		//model.addAttribute("names",planNameList);
		map.put("names", planNameList);
		//model.addAttribute("status", service.getPlanStatus());
		map.put("status", service.getPlanStatus());
	}
	




}
