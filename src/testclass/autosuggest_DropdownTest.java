package testclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common_methods.auto;
import requestrepository.reqpara;

public class autosuggest_DropdownTest {
	@Test(priority=2,description="autosuggestion dropdownselect test")
	public static void autosuggestionselect() throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		
		//create an object of chrome driver
		WebDriver driver = new ChromeDriver();
        driver.get(reqpara.url2());
            
    		driver.manage().window().maximize();
            
          WebElement  dropdown= driver.findElement(By.xpath(reqpara.searchboxxpath3()));
          dropdown.sendKeys("Quantum Physics");
 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          List<WebElement> dropdownoptiontext = driver.findElements(By.xpath(reqpara.optiontextxpath4()));
         List<WebElement> dropdownoptionclick = driver.findElements(By.xpath(reqpara.optionclickxpath5()));
          int count = dropdownoptiontext.size();     
           System.out.println(count);
           System.out.println(dropdownoptiontext);
           String expvalue=reqpara.expected_value();
        auto.autosuggestionselect(dropdownoptiontext,dropdownoptionclick,dropdown,count,expvalue );
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.quit();
        }
}
