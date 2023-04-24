package testclass;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class takeScreenShot {
@Test
	public static void screenshot() throws IOException, InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
			
			//create an object of chrome driver
			WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Sell\"]")).click();
		String uipage=driver.getTitle();
		uipage=uipage.replaceAll(".","");	
		System.out.println(uipage);
	  File screenshotsource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File screenshotfile = new File("C:\\Users\\admin\\" +uipage+ ".png" );
	  
	  Files.copy(screenshotsource, screenshotfile);
	  
	  Thread.sleep(5000);
	  
	  driver.close();
	 
	  
	
	}

	}


