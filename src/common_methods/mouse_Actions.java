package common_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import requestrepository.mouse_ActionsDataprovider;

public class mouse_Actions {
public static void action(WebDriver driver, Actions act) throws InterruptedException {
    
	//Mouse Hover
	act.moveToElement(driver.findElement(By.xpath(mouse_ActionsDataprovider.link_Accxpath()))).build().perform();
	System.out.println("Mouse mover action ");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	//Right Click
	
	act.moveToElement(driver.findElement(By.xpath(mouse_ActionsDataprovider.Amazonminitv_xpath()))).contextClick().build().perform();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.out.println("Right click-action ");

	//Double Click
	
	act.moveToElement(driver.findElement(By.xpath(mouse_ActionsDataprovider.sellelementxpath()))).doubleClick().build().perform();
	
	System.out.println("double click Action ");

	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	//Use of Shift to send keys in upper case

	act.moveToElement(driver.findElement(By.xpath(mouse_ActionsDataprovider.searchtexboxxpath()))).click().keyDown(Keys.SHIFT).sendKeys("Redmi").build().perform();
	System.out.println("Use of Shift to send keys in upper case");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.quit();

}}
