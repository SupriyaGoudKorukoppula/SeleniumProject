package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class memberlogin {
	WebDriver driver;
	@Given("^Open the application$")
public void open_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver = new ChromeDriver();
}

@When("^The User Enters the Valid Username and Password$")
public void the_User_Enters_the_Valid_Username_and_Password() throws Throwable {
	driver.get("http://localhost:8585/do/login");
	driver.findElement(By.id("cyclosUsername")).sendKeys("ksuppu");
	  driver.findElement(By.xpath("//input[@value='1']")).click();
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  driver.findElement(By.xpath("//input[@value='3']")).click();
	  driver.findElement(By.xpath("//input[@value='4']")).click();
	  //driver.findElement(By.xpath("//input[@value='Submit']")).click();

}

@Then("^Click on submit button$")
public void click_on_submit_button() throws Throwable {
	
	 driver.findElement(By.xpath("//input[@value='Submit']")).click();
}



}
