package common_methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownselectbyclick {


public static void selectbyclick(WebElement dropdown, List<WebElement> dropdownvalues,int countofdropdownvalues, ArrayList<String> data1) throws InterruptedException {
		// TODO Auto-generated method stub
		//dropdown.click();
		//Thread.sleep(3000);
		for(int i=0; i<countofdropdownvalues; i++)
		{
			System.out.println(i);
			String value=dropdownvalues.get(i).getText();
			System.out.println(value);
			String datavalue=data1.get(3);

			System.out.println(datavalue);
			
			if(value.equals(datavalue))
			{
				dropdownvalues.get(i).click();
				System.out.println("Amazon Devices option clicked and selected by method-1 ");

				break;
				
				
			
			}
			else

			{
				System.out.println("Required value not found in current iteration :" + i + " hence retrying");
			}
		}
	}	
	

		
	}

	
	

	

