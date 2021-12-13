package practice;

import org.testng.annotations.Test;

public class SampleReadDataTest {
	@Test
	public void sampleReadDataTest() {
		System.out.println("Read Test is running");
		String url = System.getProperty("url");
		String browser=System.getProperty("browser");
		String username= System.getProperty("username");
		String password =System.getProperty("password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		
	}
	

}
