package com.neotech.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("Sedat");
	 * 
	 * anotherMethod();
	 * 
	 * System.out.println("Sabah");
	 * 
	 * 
	 * }
	 * 
	 * public static void anotherMethod() { System.out.println("Said"); }
	 */
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Save logs...");
	}
	
	@BeforeClass
	public void beforClass()
	{
		System.out.println("Starting to keep logs...");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Login on the dashboard");
	}
	
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Adding employee!!!");
	}
	
	@Test(priority = 2, enabled=false)
	public void test2()
	{
		System.out.println("Removing employee!!!");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Log out of the dashboard");
	}

}
