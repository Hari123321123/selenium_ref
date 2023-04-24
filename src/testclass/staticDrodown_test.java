package testclass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common_methods.dropdownselectbyclick;
import common_methods.dropdownselectbyselect;
import common_methods.getdata_ExpDates;
//import common_methods.selectmethods;
import requestrepository.reqpara;

public class staticDrodown_test {
	

@Test(priority=1,description="validation of staticdropdownselect webelement")
	public static void dropdownselect()throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		
		//create an object of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//launch application
		
		driver.get(reqpara.url());
		driver.manage().window().maximize();
		WebElement dropdown =driver.findElement(By.xpath(reqpara.DropdownWebelementxpath1()));
		List<WebElement> dropdownvalues = driver.findElements(By.xpath(reqpara.dropdownoptionsWebelementxpath2()));
		

		int countofdropdownvalues = dropdownvalues.size();
		System.out.println(countofdropdownvalues);
		ArrayList<String> data1 =reqpara.Expectedvalue_inputfromexcel();
		
		dropdownselectbyclick.selectbyclick(dropdown,dropdownvalues,countofdropdownvalues,data1);	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
	    /* dropdownselectbyselect.selectmethod2(dropdown,dropdownvalues,countofdropdownvalues,data1);	
		dropdownselectbyselect.selectmethod3(dropdown,dropdownvalues,countofdropdownvalues,data1);	
	   dropdownselectbyselect.selectmethod4(dropdown,dropdownvalues,countofdropdownvalues,data1);	*/
		
		
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		textbox.sendKeys("Mobiles");
		WebElement submitbutton=driver.findElement(By.id("nav-search-submit-button"));
		
		
		submitbutton.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.quit();
	}
		
		
	
}