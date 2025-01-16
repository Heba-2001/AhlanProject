import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AhlanClass {
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();
	String myWebSite = "https://ahlan.had.net.sa/o/users/Login";
	String userName = "heba.alrjoub@ist-development.com";
	String passwordInput = "1234@Heba";
	
	
	
	@BeforeTest
	public void Setup() {
		driver.manage().window().maximize();
		driver.get(myWebSite);
		
        
	}
	
	
	@Test(priority = 1 , enabled = false)
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
		WebElement UserNameInputField = driver.findElement(By.id("email"));
		WebElement PassWordInputField = driver.findElement(By.id("password-input"));
		WebElement LoginButton = driver.findElement(By.className("prim-button"));
		
		UserNameInputField.sendKeys(userName);
		PassWordInputField.sendKeys(passwordInput);
		LoginButton.click();


	}
	@Test()
	public void forGotPassword() {
	WebElement forgotpassword =	driver.findElement(By.className("m-0"));
	forgotpassword.click();
	WebElement viaSMS =driver.findElement(By.className("forget-svg"));
	viaSMS.click();
	}
	
	//@Test(priority = 1)
	//public void Login() throws InterruptedException {
		//Thread.sleep(5000);

		// طريقة اخرى ل login
		//WebElement UserNameInputField = driver.findElement(By.id("user_login"));
		//WebElement PassWordInputField = driver.findElement(By.id("user_pass"));
		//WebElement LoginButton = driver.findElement(By.id("wp-submit"));

		//UserNameInputField.sendKeys(userName);
		//PassWordInputField.sendKeys(passwordInput);
		//LoginButton.click();
	//}
	

}
