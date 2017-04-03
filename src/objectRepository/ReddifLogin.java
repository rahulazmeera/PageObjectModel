package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLogin {

	
	//create the constructor hear and the objects of this login page hear 
		WebDriver driver;
	public ReddifLogin(WebDriver driver){
		//hear the this.driver represents the local driver or variable
		this.driver=driver;
		
	}
	
	By username=By.xpath(".//*[@id='login1']");
	By Password=By.id("password");
	By go=By.name("proceed");
	
	public WebElement Email(){
		return driver.findElement(username);
	}
	

	public WebElement password(){
		return driver.findElement(Password);
	}
	
	public WebElement submit(){
		return driver.findElement(go);
	}


	
	
	

}
