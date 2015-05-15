package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LocatingTagName {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		String baseURL = "http://wwww.facebook.com";
		String tagName="";
		driver.get(baseURL);
		tagName=driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		driver.close();
		//System.exit(0);
	}
}
