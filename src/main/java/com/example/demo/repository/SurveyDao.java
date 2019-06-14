package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Inquiry;
import com.example.demo.entity.Survey;

@Repository
public interface SurveyDao {
	
	void insertSurvey(Survey survey);
	
	List<Survey> getAll();
	
}