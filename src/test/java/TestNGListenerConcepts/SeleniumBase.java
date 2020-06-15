package TestNGListenerConcepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumBase {

	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	public void failed(String testMethodName) {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(srcFile,
					new File("C:\\Java Selenium\\MySeleniumTestNG\\TestNGListeners\\screenShots\\" +testMethodName+ "_" + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
