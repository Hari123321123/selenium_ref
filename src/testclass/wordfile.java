package testclass;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class wordfile{
@Test
	public static void copysnapintoWrodfile() throws IOException, InvalidFormatException, InterruptedException 
    {
       
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
			
			//create an object of chrome driver
			WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Sell\"]")).click();
	String uipage=driver.getTitle().substring(0,3);
	//uipage=uipage.replaceAll(".","");
	  File screenshotsource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File screenshotfile = new File("C:\\Users\\admin\\"+uipage+".png");
	  Files.copy(screenshotsource, screenshotfile);
	  Thread.sleep(5000);
	    XWPFDocument docx = new XWPFDocument();
        XWPFParagraph par = docx.createParagraph();
        XWPFRun run = par.createRun();
        run.setText("Snap taken :-");
        run.setFontSize(13);
     InputStream pic = new FileInputStream(screenshotfile);
        run.addPicture(pic, Document.PICTURE_TYPE_PNG, "3", Units.toEMU(500),Units.toEMU(250));
        FileOutputStream out = new FileOutputStream("C:\\Users\\admin\\Test.docx"); 
        docx.write(out);   
        out.close(); 
        pic.close();
    }
}

	


