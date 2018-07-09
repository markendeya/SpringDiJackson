package com.app;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		Employee e=(Employee)ac.getBean("eob");
		System.out.println(e);
		String json = null;
		try
		{
			//converting Employee Object to Json Format

			ObjectMapper om= new ObjectMapper();
			json=om.writeValueAsString(e);

		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		//Printing Json Object
		System.out.println("java object in Json format");
		System.out.println(json);

	}

}
