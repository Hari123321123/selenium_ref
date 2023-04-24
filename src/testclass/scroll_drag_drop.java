package testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common_methods.scroll_drag_drop_Method;
import requestrepository.drag_drop_scrollpara;

public class scroll_drag_drop { @Test
	public static void scroll_drag_dropTest() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();
		driver.get(drag_drop_scrollpara.drapdropurl());
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Switch to a frame
		
		WebElement frame = driver.findElement(By.xpath(drag_drop_scrollpara.framexpath()));
		
		driver.switchTo().frame(frame);
		
		WebElement dragelement = driver.findElement(By.xpath(drag_drop_scrollpara.dragelementxpath()));
		WebElement droptarget = driver.findElement(By.xpath(drag_drop_scrollpara.droplementxpath()));
		scroll_drag_drop_Method.drag_drop(dragelement, droptarget,act);
		act.dragAndDrop(dragelement, droptarget).build().perform();
		//scroll 
		driver.switchTo().parentFrame();
		WebElement elementoutsideframe = driver.findElement(By.xpath(drag_drop_scrollpara.elementoutsideframexpath()));

		scroll_drag_drop_Method.scroll(js,elementoutsideframe,driver);
		
		driver.quit();
}}
