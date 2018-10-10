package it.unical.agile.MavenProj;

import org.junit.Test;

public class MyMathPerformanceTests {
	
	@Test(expected = IllegalArgumentException.class)
	public void testException() {
		MyMath ma = new MyMath();
		ma.fibonacci(-1);
	}
	
	@Test(timeout = 10000)
	public void performanceTest1() {
		MyMath ma = new MyMath();
		System.out.println(ma.fibonacci(45));	
	}

}
