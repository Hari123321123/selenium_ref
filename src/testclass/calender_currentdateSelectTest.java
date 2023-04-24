package testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common_methods.select_currentDate;
import requestrepository.reqpara;

public class calender_currentdateSelectTest {
	@Test
	public static void Currentdate_select() {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
	
	//create an object of chrome driver
	WebDriver driver = new ChromeDriver();
	
	//launch application
	
	driver.get(reqpara.url3());
	driver.manage().window().maximize();
	WebElement close =driver.findElement(By.xpath(reqpara.closewindowxpath()));
    close.click();

	WebElement caldate=driver.findElement(By.xpath(reqpara.dropwonarrowxpath()));
	caldate.click();
	WebElement dates =driver.findElement(By.xpath(reqpara.currentdate_calxpath()));
	select_currentDate.cdate_cal(dates);
driver.quit();
}
}