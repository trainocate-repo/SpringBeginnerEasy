package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Inquiry;

public interface InquiryDao {
	
	void insertInquiry(Inquiry inquiry);
	
//  This is used in the latter chapter
//  こちらは後で使用
//	int updateInquiry(Inquiry inquiry);
	
	List<Inquiry> getAll();
}