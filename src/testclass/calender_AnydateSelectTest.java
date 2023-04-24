package testclass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common_methods.getdata;
import common_methods.getdata_ExpDates;
import common_methods.selectAnydates;
import common_methods.select_currentDate;
import requestrepository.reqpara;

public class calender_AnydateSelectTest {

	@Test(priority=1,description=" ")
		// TODO Auto-generated method stub
	public static void calselect()throws InterruptedException, IOException {
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
			//WebElement dates =driver.findElement(By.xpath(reqpara.currentdate_calxpath()));

			Thread.sleep(3000);
			
			//Select Anydate 
			 List<WebElement> sel_anydate=driver.findElements(By.xpath(reqpara.sel_Anydatexpath()));
            int count= sel_anydate.size();
            List<WebElement> Datestext = driver.findElements(By.xpath(reqpara.sel_Anydate_Textxpath()));
            System.out.println(count);
			//select_currentDate.cdate_cal( dates);
            ArrayList<String> data2=reqpara.Expecteddate_inputfromexcel();
            
			selectAnydates.anydate(sel_anydate,Datestext,count,data2);
driver.quit();
	}

}
