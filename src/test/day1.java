package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I am after test in day1 ");
		
	}
	@Test
	public void Demo()
	{
		System.out.println("hello in day 1");//automation
		Assert.assertTrue(false);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am After suit in Day1 ");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}



}
