package test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWEB19 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/Heer/My Study/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(
				"http://qa@testing.com:123456@automationpractice.com/index.php?controller=authentication&back=my-account");

		try {
			WebElement a1 = driver.findElement(By.xpath("//*[@id='email']"));
			System.out.println("---------Emaild exists --------------\n-----------------------");
			a1.sendKeys("qa@testing.com");
		} catch (Throwable e) {
			System.out.println("Emaild not found: " + e.getMessage());
		}

		try {
			WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
			System.out.println("----------Passwordd exits ------------\n-----------------------");
			password.sendKeys("123456");
		} catch (Throwable e) {
			System.out.println("Passwordd not found: " + e.getMessage());
		}

		try {
			WebElement button = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
			button.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Throwable e) {
			System.out.println("Signutton not found: " + e.getMessage());
		}
		try{
			WebElement loggedInUser = driver.findElement(By.id("qa@testing.com"));
			System.out.println("You've logged in");
		}catch(Throwable e){
			System.out.println("Sorry, something went wrong. Please try again!");
		}
	}

}
