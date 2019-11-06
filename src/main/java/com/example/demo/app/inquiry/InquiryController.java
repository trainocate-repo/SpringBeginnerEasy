package com.example.demo.app.inquiry;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Inquiry;
import com.example.demo.service.InquiryNotFoundException;
import com.example.demo.service.InquiryServiceImpl;

/*
 * Add annotations here
 */
public class InquiryController {
	
// 	private final InquiryServiceImpl inquiryService;
	
	//Add an annotation here 
// 	public InquiryController(InquiryServiceImpl inquiryService){
// 		this.inquiryService = inquiryService;
// 	}
	
	@GetMapping
	public String index(Model model) {
		
		//hands-on
		
		return "inquiry/index";
	}
	
	@GetMapping("/form")
	public String form(/*Add parameters. */) {
		
		return "inquiry/form";
	}
	
	@PostMapping("/form")
	public String formGoBack(InquiryForm inquiryForm, Model model) {
		model.addAttribute("title", "InquiryForm");
		return "inquiry/form";
	}
	
	
	@PostMapping("/confirm")
	public String confirm(/*Add parameters. */) {

		//hands-on
		
		return "inquiry/confirm";
	}
	
	@PostMapping("/complete")
	public String complete(/*Add parameters. */) {
		
		//hands-on
		
		//redirect
		
		return "";
	}
	
}
