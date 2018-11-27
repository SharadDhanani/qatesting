package test_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWEB {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/Heer/My Study/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("QA\n"); // send also a "\n"

		driver.findElement(By.partialLinkText("Quality assurance - Wikipedia")).click();
		waitForLoad(driver);

		try {
			driver.findElement(By.xpath("//*[@href='http://en.wikipedia.org/wiki/Quality_assurance']//h3/a[2]"));
			System.out.println("Link exists");
		} catch (Exception e) {
			System.out.println("The link not found");
		} finally {
			driver.close();
		}
	}

	public static void waitForLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(pageLoadCondition);
	}
}
