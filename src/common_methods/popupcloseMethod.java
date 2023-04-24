package common_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import requestrepository.popupclosereqpara;

public class popupcloseMethod {
public static void popupclose(WebDriver driver)
        {
	
	try {
		
        WebElement popupclose =driver.findElement(By.xpath(popupclosereqpara.popupcloseelementxpath()));

		if (popupclose.isDisplayed())
			
		{
			popupclose.click();
			System.out.println("Popup closed");
		}
							
	} catch(NoSuchElementException e)
	{
	
	System.out.println("No popupdisplayed");
	}
	
}


	
}

