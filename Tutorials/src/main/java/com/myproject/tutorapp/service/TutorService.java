package com.myproject.tutorapp.service;

import org.springframework.stereotype.Service;

@Service
public class TutorService {

	public String tutorNames(String subject) {
		
		if (subject.equalsIgnoreCase("java")) {
			return "Santosh";
		} if (subject.equalsIgnoreCase("angular")){
			return "ruthvik";
		}if (subject.equalsIgnoreCase("dotnet")){
			return "shanthan";
		}if (subject.equalsIgnoreCase("hadoop")){
			return "venky";
		}else {
			return "pawan";
		}
	}
}
