package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;

	public WebDriver initialwebdriver() throws IOException {
	Properties prop = new Properties ();
	
	FileInputStream fis = new FileInputStream(		
			"C:\\Users\\Sai\\eclipse-workspace\\finaldemo\\src\\main\\java\\resources\\Data.Properties");
	prop.load(fis);
	String Browsername=prop.getProperty("Browser");
	
	if (Browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	}
	else if(Browsername.equals("firefox")) {
		// firefox code
	}
	else {
		//internal explorer code
	}
	return driver;

		
	
}
}
