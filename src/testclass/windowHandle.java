package testclass;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common_methods.status_code;
import requestrepository.windowhandleUrl;

import org.openqa.selenium.WebElement;

public class windowHandle {
	@Test
	public static void windowhandlerMethod()throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
			
			//create an object of chrome driver
			WebDriver driver = new ChromeDriver();
	String [] exp_title= {"Git Tutorial for Beginners with Examples and Sample project",
				"Complete Agile Tutorial & Scrum Tutorial with Easy Examples",
				"ISTQB Foundation Level - ISQTB Tutorial for preparing Course Syllabus",
				"Learn Cucumber | Cucumber Tutorial for Beginners",
				"Postman Tutorial for Beginners to perform API Testing",
				"Rest Assured Tutorial for REST API Automation Testing"};
				
		driver.get(windowhandleUrl.url());
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll to bottom of the page
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(windowhandleUrl.pagebottomelementxpath())));
		
		//Fetch the count of Hyperlink 
		List<WebElement> Hyperlinks = driver.findElements(By.xpath(windowhandleUrl.hyperlinksxpath()));
		//List<WebElement> Hyperlinks = driver.findElements(By.xpath("//a[@href]"));
		int count = Hyperlinks.size();
		
		 
		//Open the Hyperlink in next tab
		for(int i=1 ; i<count ; i++)
		{
			act.moveToElement(Hyperlinks.get(i)).keyDown(Keys.CONTROL).click().build().perform();
		}
		//Verify if hyperlink are open correctly in windows or not
	
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowsiterator=windows.iterator();
		windowsiterator.next();
		/// //broken links validation by Method-1 (page title check)

		while(windowsiterator.hasNext())
		{			

			for(int i=1 ; i<count ; i++) {
			driver.switchTo().window(windowsiterator.next());
			String WindowsTitle = driver.getTitle();
			System.out.println(WindowsTitle);
			System.out.println(exp_title[i-1]);
       
			
		if (WindowsTitle.equalsIgnoreCase(exp_title[i-1]))
		{
			System.out.println("Not a broken link and page loaded");
		}
		else 
		{
			
			System.out.println(" broken link so page not loaded");

		}}}
		driver.close();
		String url=windowhandleUrl.url();
	int s_code=	status_code.statuscodeext(url);
		/// //broken links validation by Method-2(Status code check)
		if (s_code>226) {
			System.out.println(" broken link -page not loaded");

	    }
		else { 
		
			System.out.println(" Not a broken link so page loaded");
		}
        driver.quit();
		}
		
}