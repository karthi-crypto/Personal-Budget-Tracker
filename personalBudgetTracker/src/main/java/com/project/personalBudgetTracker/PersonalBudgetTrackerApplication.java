package com.project.personalBudgetTracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonalBudgetTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalBudgetTrackerApplication.class, args);
		String url="jdbc:mysql://localhost:3306/budget_tracker";
		String username="root";
		String password="30162088";
		
		try(Connection con=DriverManager.getConnection(url, username, password)){
			if(con!=null) {
				System.out.println("Connection established Successfully");
			}
			else {
				System.out.println("Connection Failed");
			}
		}
		catch(SQLException ex) {
			System.out.println("Failed to connect db"+ex.getMessage());
		}
	}

}
