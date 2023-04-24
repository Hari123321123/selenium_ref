package common_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class scroll_drag_drop_Method {
public static void drag_drop(WebElement dragelement, WebElement droptarget, Actions act) {
	act.dragAndDrop(dragelement, droptarget).build().perform();
	System.out.println("Drag and drop inside frame ");

}
public static void scroll(JavascriptExecutor js, WebElement elementoutsideframe, WebDriver driver) throws InterruptedException {
	js.executeScript("arguments[0].scrollIntoView();", elementoutsideframe);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	elementoutsideframe.click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
	System.out.println("clicked on element ouside frame  ");

}
}