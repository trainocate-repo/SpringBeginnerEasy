package com.example.demo.config;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import com.example.demo.service.InquiryNotFoundException;


/**
 * 全てのControllerで共通処理を定義
 */
@ControllerAdvice
public class WebMvcControllerAdvice {

	/*
	 * This method changes empty character to null
	 * こちらのメソッドを用意しておくと送信された空文字はnullに変換されます
	 */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
    
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public String handleException(EmptyResultDataAccessException e,Model model) {
		model.addAttribute("message", e);
		return "error/CustomPage";
	}
	
//	@ExceptionHandler(InquiryNotFoundException.class)
//	public String handleException(InquiryNotFoundException e,Model model) {
//		model.addAttribute("message", e);
//		return "error/CustomPage";
//	}
   
}