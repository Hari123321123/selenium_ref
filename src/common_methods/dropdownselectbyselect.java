package common_methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdownselectbyselect {
public static void selectmethod2(WebElement dropdown, List<WebElement> dropdownvalues, int countofdropdownvalues,ArrayList<String> data1) {
		
		Select selectobject = new Select(dropdown);
	
		
		for(int i=0; i<countofdropdownvalues; i++)
		{
			String value=dropdownvalues.get(i).getText();
			String datavalue=data1.get(3);

			if(value.equals(datavalue))
			{
				selectobject.selectByIndex(i);
				System.out.println("Amazon Devices option clicked and selected by method-2");

				break;
			}
			else
			{
				System.out.println("Required value not found in current iteration :" + i + " hence retrying");
			}
		}
		
	}

	public static void selectmethod3(WebElement dropdown, List<WebElement> dropdownvalues, int countofdropdownvalues,ArrayList<String> data1) {
		
		
		Select selectobject = new Select(dropdown);
		//selectobject.selectByValue("search-alias=beauty");
		//selectobject.selectByVisibleText("Baby");
		
		for(int i=0; i<countofdropdownvalues; i++)
		{
			String value=dropdownvalues.get(i).getText();
		System.out.println(value);
			String datavalue=data1.get(3);
		System.out.println(datavalue);
			if(value.equals(datavalue))
			{
				selectobject.selectByValue("search-alias=amazon-devices");
				System.out.println("Amazon Devices option clicked and selected by method-3");
				break;
			}
			else
			{
				System.out.println("Required value not found in current iteration :" + i + " hence retrying");
			}
		}		
	}



	public static void selectmethod4(WebElement dropdown, List<WebElement> dropdownvalues, int countofdropdownvalues,
			ArrayList<String> data1) {
		Select selectobject = new Select(dropdown);
		//selectobject.selectByValue("search-alias=beauty");
		//selectobject.selectByVisibleText("Baby");
		
		for(int i=0; i<countofdropdownvalues; i++)
		{
			String value=dropdownvalues.get(i).getText();
		System.out.println(value);
			String datavalue=data1.get(3);
		System.out.println(datavalue);
			if(value.equals(datavalue))
			{
				
				selectobject.selectByVisibleText("Amazon Devices");

				System.out.println("Amazon Devices option clicked and selected by method-4");
				break;
			}
			else
			{
				System.out.println("Required value not found in current iteration :" + i + " hence retrying");
			}
		}				
	}



		
}
