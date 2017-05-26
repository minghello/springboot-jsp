package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.SampleService;

@Controller
public class SampleController {
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("/")
	public String hello() {
		
		System.out.println(sampleService.selectList());
		
		return "sample";
	}
}
