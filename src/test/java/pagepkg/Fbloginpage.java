package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpass;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	
	public Fbloginpage(WebDriver driver)                //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);         //initialize using page factrory
	}
	
	
 public void setvalues(String email,String pswd)         //action methods
 {
	fbemail.sendKeys(email);
	fbpass.sendKeys(pswd);
 }

 public void loginclick()
 {
	fblogin.click();
 } 
}
