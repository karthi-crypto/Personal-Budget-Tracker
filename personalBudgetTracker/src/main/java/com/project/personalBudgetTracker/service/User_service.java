package com.project.personalBudgetTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.personalBudgetTracker.entity.User_entity;
import com.project.personalBudgetTracker.repository.User_repository;

@Service
public class User_service {
    @Autowired
    User_repository userrepo;
    public List<User_entity> fetchUserDetails(){
		return userrepo.findAll();
	}
	
}
