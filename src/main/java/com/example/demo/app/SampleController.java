package com.example.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Add annotations here
 * ここにアノテーションを追加
 */
public class SampleController {
	
	private final JdbcTemplate jdbcTemplate;

	//Add an annotation here ここにアノテーションを追加
	public SampleController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@GetMapping
	public String test(Model model) {
		
		//hands-on

		return "test";
	}

}