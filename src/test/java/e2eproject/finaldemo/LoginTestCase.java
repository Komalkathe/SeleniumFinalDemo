package e2eproject.finaldemo;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectModel.HomePageObjects;
import pageObjectModel.LoginPageObject;
import resources.BaseClass;

public class LoginTestCase extends BaseClass {
	/*@BeforeMethod
	public void browserlaunch () throws IOException {
		driver= initialwebdriver ();
		driver.get("http://www.qaclickacademy.com/");
		
		
	}*/
	
	@Test(dataProvider="getData")
	public void Basepagenavigation (String username, String password) throws IOException {
		driver= initialwebdriver ();
		driver.get("http://www.qaclickacademy.com/");
		
		
		HomePageObjects Hpo= new HomePageObjects (driver);
		Hpo.clicksignin().click();
		
		 LoginPageObject Lpo= new LoginPageObject (driver);
		 Lpo.EnterUsername().sendKeys(username);
		 Lpo.Enterpassword().sendKeys(password);
		 Lpo.clicklogin().click();
	}
		 @DataProvider
			public Object[][] getData(){
				Object[][] data=new Object[2][2];  // 2rows and 2colums
				data[0][0]="test@1";    //zerwoth row and zerowth column
				data[0][1]="komal123";  // zerowth row and 1st column
				data[1][0]="test@2";    // 1 st row 0th column
				data[1][1]="abcd";     //1st row 1st column
				return data;		
		 
		
			
		
		
	}
	
	

}
