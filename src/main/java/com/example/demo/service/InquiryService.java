package com.example.demo.service;

import java.util.List;

import com.example.demo.app.inquiry.InquiryForm;
import com.example.demo.entity.Inquiry;

public interface InquiryService {
	
	void save(Inquiry inquiry);
	
//  This is used in the latter chapter
//  こちらは後で使用
//	void update(Inquiry inquiry);
	
	List<Inquiry> getAll();

}