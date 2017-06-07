package com.xawl.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xawl.study.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	
	@RequestMapping("/course/addpre")
	public ModelAndView addPreCourse() {
		
		
		return null;
	}

	public ModelAndView addCourse() {

		return null;
	}

}
