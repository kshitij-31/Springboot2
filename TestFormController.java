package com.example.UserFeedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.services.FeedbackService;

@Controller
public class TestFormController {

	@Autowired
	FeedbackService fbs;
	
	 @GetMapping(value="/testform")
     public Iterable<Feedback> showTestForm(ModelMap model) {
		 //TODO: Create a JSP called "testformjsp.jsp"  
		 return fbs.GetAllFeedback();
     }

}
