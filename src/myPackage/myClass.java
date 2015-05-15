package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myClass {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://newtours.demoaut.com";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle="";
		//launch firefox and direct it to the base url
		driver.get(baseURL);
		//get the title of the page
		actualTitle = driver.getTitle();
		//check the title
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed");
		}else{
				System.out.println("Test Failed");
		}
		//close firefox
		driver.close();
		//exit the program explicitly
		//System.exit(0);
	}
}
