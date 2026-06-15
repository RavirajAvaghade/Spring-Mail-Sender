package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot1MailSendingProgramApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Springboot1MailSendingProgramApplication.class, args);
	}
	//Methods in program
	public void run()
	{
		System.out.println("run");
	}
	public void ravi()
	{
		System.out.println("ravi");
	}
	public void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	public void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	public void div(int x,int y)
	{
		System.out.println(x/y);
	}

}
