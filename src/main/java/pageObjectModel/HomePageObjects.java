package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	public  WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	
	
	
	
	
	public HomePageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}





	public WebElement clicksignin () {
		return driver.findElement(signin);
	}

}


/*
 Framework FinalDemo
1. MAven project--- Proper structire
2. Pom.xml--Dependancy add --- selenium and testng 
3. src/main/java--
    Page object model--
    Resource:
   1.Data Properties--key and value--- browser 
   2.Base class--driver initailaize code
4. src/test/java
   Actual test cases
constructor--

dataprovider-- same test cases multiple time repeat--with diffrent username and passwrord 


Login test cases
Register test cases

PRoject---testng--convert to 

 */




