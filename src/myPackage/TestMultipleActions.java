package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;



public class TestMultipleActions {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("deepu");
		txtUserName.clear();
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(txtUserName)
				.click()
				.keyDown(txtUserName,Keys.SHIFT)
				.sendKeys(txtUserName,"hello")
				.keyUp(txtUserName,Keys.SHIFT)
				.doubleClick(txtUserName)
				
				.build();
		seriesOfActions.perform();
				
	}

}
