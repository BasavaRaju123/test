package aFrame;

import org.testng.annotations.Test;

public class practice2 {
	
	@Test
	public void webLogin1() {
		
		System.out.println("webLogin");
	}

	@Test
	public void mobLogin2() {
		
		System.out.println("mobLogin");
	}
	
	@Test(enabled=false)
	public void apiLogin3() {
		
		System.out.println("apiLogin");
	
	}

}
