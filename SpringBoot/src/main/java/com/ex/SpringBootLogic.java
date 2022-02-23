package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication  // once  write the @SpringBootApplication we don't require the @configure , @EnableAutoConfiguration and @ComponentScan
public class SpringBootLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ca=SpringApplication.run(SpringBootLogic.class, args);
		/* Student sai=new Student();// object
		sai.setSid(1);
		sai.setMarks(300);
		sai.setSname("sailaxmi"); */
		
		Student s=ca.getBean(Student.class);// getBean means it provide the object
		s.setSid(1);
		s.setSname("sai");
		s.setMarks(900);
		System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMarks());
	}

}
