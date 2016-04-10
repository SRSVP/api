package com.myproject.tutorapp.web;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.myproject.tutorapp.service.TutorService;

@RunWith(MockitoJUnitRunner.class)
public class TutorControllerTest {
	
	@InjectMocks
	private TutorController  tutorController;
	@Mock
	private TutorService tutorService;
	
	//private static final String subject="java";
	
	@Test
	public void getsTutorWithJava() throws Exception {
		
		Mockito.when(tutorService.tutorNames("java")).thenReturn("santosh");
		String tutorName = tutorController.getTutorName("java");
		
		Assert.assertEquals(tutorName,"santosh");
	}
	@Test
	public void getsTutorWithdotnet() throws Exception {
		
		Mockito.when(tutorService.tutorNames("dotnet")).thenReturn("shanthan");
		String tutorName = tutorController.getTutorName("dotnet");
		
		Assert.assertEquals(tutorName,"shanthan");
	}
	@Test
	public void getsTutorWithhadoop() throws Exception {
		
		Mockito.when(tutorService.tutorNames("hadoop")).thenReturn("venky");
		String tutorName = tutorController.getTutorName("hadoop");
		
		Assert.assertEquals(tutorName,"venky");
	}
	@Test
	public void getsTutorWithangular() throws Exception {
		
		Mockito.when(tutorService.tutorNames("angular")).thenReturn("ruthvik");
		String tutorName = tutorController.getTutorName("angular");
		
		Assert.assertEquals(tutorName,"ruthvik");
	}
	@Test
	public void getsTutorWithOtherSubjects() throws Exception {
		
		Mockito.when(tutorService.tutorNames("science")).thenReturn("pawan");
		String tutorName = tutorController.getTutorName("science");
		
		Assert.assertEquals(tutorName,"pawan");
	}

}
