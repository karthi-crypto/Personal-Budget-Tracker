package com.project.personalBudgetTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.personalBudgetTracker.entity.User_entity;

@Repository
public interface User_repository extends JpaRepository<User_entity,Integer>{

}
