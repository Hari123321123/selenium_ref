package seleniumwebdriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class webauto {
	
	static WebDriver driver;
	static WebElement email;
	static WebElement pass;
	static WebElement login1;

	@BeforeClass
			public static void setup()
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse\\chromedriver.exe");  
				
				/*ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);
		        WebDriver driver=new ChromeDriver(options);  */	
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
		        driver=new ChromeDriver(options);  	
		        
		//LaunchWebsite  
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc0NDUxNTQ5LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");

		email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		driver.manage().window().maximize();}

	
	
	@Test(description="logintofacebook")

public static void login() {
		
			if (email.isDisplayed() && email.isEnabled())
			{
			
				email.sendKeys("chaudharishubham61@gmail.com");
			
				// TODO Auto-generated catch block
			
			}
			
	
		
		if (pass.isDisplayed() && pass.isEnabled())

		{
		pass.sendKeys("");
		}
		login1 =driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));

		login1.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String Exp_title  ="(20+) Facebook";
		String Act_title = driver.getTitle();

		driver.quit();

		if (Exp_title.equals(Act_title))
		{
			System.out.println("Page title validation-Test passed");
			
		}
		else 
		{
			System.out.println("Page title validation -Test fail");
		}
		}
	
     @AfterClass
	public void closethedriver() {
		driver.quit();
		
	}
		}
		
	


