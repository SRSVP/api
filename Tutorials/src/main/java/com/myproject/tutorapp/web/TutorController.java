package com.myproject.tutorapp.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.tutorapp.ListOfString;
import com.myproject.tutorapp.service.TutorService;

@Controller
public class TutorController {

	@Inject
	private TutorService tutorService;

	@ResponseBody
	@RequestMapping(value = "/tutor/{subject}", method = RequestMethod.GET, produces = "application/json")
	public String getTutorName(@PathVariable String subject) throws JsonProcessingException {
		String response = tutorService.tutorNames(subject);
//		ListOfString listOfString=new ListOfString();
//		listOfString.setName(response);
//		listOfString.setRoll("5a0");
//		ObjectMapper mapper = new ObjectMapper();  
//		String uniJSON = mapper.writeValueAsString(listOfString) ;
		return response;
	}
}
