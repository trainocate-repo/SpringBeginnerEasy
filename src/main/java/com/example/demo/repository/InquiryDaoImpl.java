package com.example.demo.repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Inquiry;

/*
 * Add an annotation here
 */
public class InquiryDaoImpl implements InquiryDao{
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public InquiryDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertInquiry(Inquiry inquiry) {
		//hands-on	
	}
	
//  This method is used in the latter chapter
//	@Override
//	public int updateInquiry(Inquiry inquiry) {
//		return jdbcTemplate.update("UPDATE inquiry SET name = ?, email = ?,contents = ? WHERE id = ?",
//				 inquiry.getName(), inquiry.getEmail(), inquiry.getContents(), inquiry.getId() );	
//	}

	@Override
	public List<Inquiry> getAll() {
		
		//make SQL
		
		List<Map<String, Object>> resultList = null;
		
		List<Inquiry> list = null;
		
		//Set the data form database into Inquiry instance
		
		return list;
	}
	
}
