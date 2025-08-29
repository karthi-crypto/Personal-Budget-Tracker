package com.project.personalBudgetTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.personalBudgetTracker.entity.User_entity;
import com.project.personalBudgetTracker.service.User_service;

@RestController
public class User_controller {
    @Autowired
    User_service service;

	@GetMapping("/fetchUserdetails")
	public List<User_entity> fecthBusinessDetails(){
		return service.fetchUserDetails();
	}
}
