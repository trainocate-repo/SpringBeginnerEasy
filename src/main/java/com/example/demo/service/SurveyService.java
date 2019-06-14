package com.example.demo.service;

import java.util.List;

import com.example.demo.app.survey.SurveyForm;
import com.example.demo.entity.Survey;

public interface SurveyService {
	
	void save(Survey survey);
	
	List<Survey> getAll();

}