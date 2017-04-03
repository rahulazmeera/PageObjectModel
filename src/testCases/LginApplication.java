package testCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import objectRepository.ReddifLogin;

public class LginApplication {

	//creat the script require to invoke the web page 
	
	//creat the login method hear 
	@Test
	public void login(){
		
        System.setProperty("webdriver.gecko.driver","E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe");
		//creating the object for the fire fox driver
		WebDriver driver=new FirefoxDriver();
		//get the target url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//hear create the object for the rediff login class where the element object locators are present
		ReddifLogin obj=new  ReddifLogin(driver);
		obj.Email().sendKeys("rahul.gandhi484@gmail.com");
		obj.password().sendKeys("azmeera1993");
		obj.submit().click();
		
		
		
	}
	
	
	
}
