package com.example.demo.app.survey;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Survey;
import com.example.demo.service.SurveyService;
import com.example.demo.service.SurveyServiceImpl;

/*
 * Add annotations here
 */
public class SurveyController {
	
	private final SurveyService surveyService;
	
	@Autowired
	public SurveyController(SurveyService surveyService){
		this.surveyService = surveyService;
	}
	
	@GetMapping
	public String index(Model model) {
		
		//hands-on
		
		return "survey/index";
	}
	
	@GetMapping("/form")
	public String form(/*Add parameters.*/) {
		
		//hands-on
		
		return "survey/form";
	}
	
	@PostMapping("/form")
	public String form(SurveyForm surveyForm, Model model) {
		
		//hands-on
		
		return "survey/form";
	}
	
	
	@PostMapping("/confirm")
	public String confirm(/*Add parameters.*/) {
		
		//hands-on
		
		return "survey/confirm";
	}
	
	@PostMapping("/complete")
	public String complete(/*Add parameters.*/) {
		
		//hands-on
		
		return "";
	}
	
}
