package pkg1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.navigate().to("https://www.monogramweb.com/customer/account/login/");

		driver.findElement(
				By.xpath("html/body/div[1]/div/div[4]/div/div/div[3]/form/div/div[2]/div/div[1]/ul/li[1]/div/input"))
				.sendKeys("tarikuli@yahoo.com");

		// Change Correct Password
		driver.findElement(
				By.xpath("html/body/div[1]/div/div[4]/div/div/div[3]/form/div/div[2]/div/div[1]/ul/li[2]/div/input"))
				.sendKeys("***");
		driver.findElement(By.xpath("html/body/div[1]/div/div[4]/div/div/div[3]/form/div/div[2]/div/div[2]/button "))
				.click();

		WebElement myDashboard = driver
				.findElement(By.xpath("html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div/div[1]/h1 "));
		String text = myDashboard.getText();

		Assert.assertEquals(text, "My Dashboard");

		driver.close();

		// ----------------------------

		// WebDriver fDriver;
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver fDriver = new FirefoxDriver();

		fDriver.manage().window().maximize();
		fDriver.navigate().to("https://www.monogramweb.com/customer/account/login/");

		fDriver.findElement(
				By.xpath("html/body/div[1]/div/div[4]/div/div/div[3]/form/div/div[2]/div/div[1]/ul/li[1]/div/input"))
				.sendKeys("tarikuli@yahoo.com");

		// Change Correct Password
		fDriver.findElement(
				By.xpath("html/body/div[1]/div/div[4]/div/div/div[3]/form/div/div[2]/div/div[1]/ul/li[2]/div/input"))
				.sendKeys("***");
		fDriver.findElement(By.xpath("html/body/div[1]/div/div[4]/div/div/div[3]/form/div/div[2]/div/div[2]/button"))
				.click();

		WebElement myDashboard1 = fDriver
				.findElement(By.xpath("html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div/div[1]/h1"));

		String text1 = myDashboard1.getText();

		Assert.assertEquals(text1, "My Dashboard");

		fDriver.close();
	}

	/***
	 * Memo
	 */
	// _driver.findElement(By.id("lst-ib")).clear();
	// _driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	// _driver.findElement(By.name("btnG")).click();
	// _driver.findElement(By.linkText("Selenium - Web Browser
	// Automation")).click();

}
