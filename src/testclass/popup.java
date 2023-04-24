package testclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common_methods.popupcloseMethod;
import requestrepository.popupclosereqpara;

public class popup {   @Test
	public static void popupclose()throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		
	    WebDriver driver = new ChromeDriver();
		
		//launch application
		
		driver.get(popupclosereqpara.url());
		driver.manage().window().maximize(); 
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
         popupcloseMethod.popupclose(driver);
		driver.quit();
	}
		
}
