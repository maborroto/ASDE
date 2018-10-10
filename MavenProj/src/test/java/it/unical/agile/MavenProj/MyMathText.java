package it.unical.agile.MavenProj;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathText {
	
	@BeforeClass
	public static void before() {
		System.out.println("Before");
	}

	
	@Test
	public void fibonacciTest1() {		
		MyMath ma = new MyMath();		
		assertEquals(ma.fibonacci(5), 8);
		System.out.println("Test1");
	}
	
	@Test
	public void fibonacciTest2() {
		MyMath ma = new MyMath();
		assertEquals(1, ma.fibonacci(0));
		System.out.println("Test2");
	}
	
	@AfterClass
	public static void cleanUp() {
		System.out.println("After Class");
	}
	
}
