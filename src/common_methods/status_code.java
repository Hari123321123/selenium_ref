package common_methods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class status_code {
	 public static int statuscodeext(String url)throws
	   MalformedURLException, IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
			
			//create an object of chrome driver
			WebDriver driver = new ChromeDriver();
	      driver.get(url);
	      // wait of 5 seconds
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      // establish and open connection with URL
	      HttpURLConnection c=(HttpURLConnection)new URL("https://www.toolsqa.com/").openConnection();
	      // set the HEAD request with setRequestMethod
	      c.setRequestMethod("HEAD");
	      // connection started and get response code
	      c.connect();
	      int statuscode = c.getResponseCode();
	      System.out.println("Http response code: " +statuscode);
	    driver.quit();
		return statuscode;
	   }
}
