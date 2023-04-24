package common_methods;

import org.openqa.selenium.WebElement;

public class select_currentDate {
public static void cdate_cal(WebElement dates) {
	String currentdate=dates.getText();
	System.out.println("Selected date  "+ currentdate);
	/*if(currentdate.equals("16"))
    {
	   dates.click();
      System.out.println("Expected date found " );
      
    }
   else
    {
System.out.println("current date is not selected "  );	    }

	*/
}

}

