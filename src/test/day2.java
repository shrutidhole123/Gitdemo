package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("I am test in group smoke");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I am Before test in day2");
	}
}
