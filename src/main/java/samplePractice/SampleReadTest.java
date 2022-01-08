package samplePractice;

import org.testng.annotations.Test;

public class SampleReadTest {
	@Test
	public void sampleReadTest() {
		String url = System.getProperty("url");
		String browser= System.getProperty("browser");
		System.out.println(url);
		System.out.println(browser);
		
	}

}
