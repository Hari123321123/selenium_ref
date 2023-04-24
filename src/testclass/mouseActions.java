package testclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common_methods.mouse_Actions;
import requestrepository.mouse_ActionsDataprovider;

public class mouseActions {

	
@Test

		public static void mouseAction1() throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
			
			WebDriver driver=new ChromeDriver();
			
			driver.get(mouse_ActionsDataprovider.url());
			
			driver.manage().window().maximize();
			
			Actions act=new Actions(driver);
			mouse_Actions.action(driver,act);
			
		}

	}

	


