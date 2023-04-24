package common_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class auto {

	public static void autosuggestionselect(List<WebElement> dropdownoptiontext, List<WebElement> dropdownoptionclick, WebElement dropdown,int count,String expvalue) throws InterruptedException {
		// TODO Auto-generated method stub


        for (int i=0 ; i < count ; i++)  
            {
               String optionvalue1= dropdownoptiontext.get(i).getText();
             System.out.println(optionvalue1);
             
            if(optionvalue1.equals(expvalue))

               {
                  dropdownoptionclick.get(i).click();
                 break;
               }
               
               else
               {
                 System.out.println("Desired option not found in iteration " + i + "hence retrying");
               }        

            }

        }}
	


