package com.myproject.tutorapp.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TutorServiceTest {
	@InjectMocks
	private TutorService  tutorService;
	
	@Test
	public void getsSantoshForJava() throws Exception {
		
		String tutorNames = tutorService.tutorNames("java");
		assertEquals(tutorNames,"Santosh");
	}
	@Test
	public void getsRuthvikForAngular() throws Exception {
		
		String tutorNames = tutorService.tutorNames("angular");
		assertEquals(tutorNames,"ruthvik");
	}
	@Test
	public void getsSanthandotnet() throws Exception {
		String tutorNames = tutorService.tutorNames("dotnet");
		assertEquals(tutorNames, "shanthan");
	}
	@Test
	public void getsHadoopVenky() throws Exception {
		String tutorNames = tutorService.tutorNames("hadoop");
		assertEquals(tutorNames, "venky");
	}
	
	@Test
	public void otherName() throws Exception {
		String tutorNames = tutorService.tutorNames("other");
		assertEquals(tutorNames, "pawan");
	}
	
}
