package myPackage;
import mercuryTours.Util;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class TestMouseOver {
	static WebDriver driver;
	static String base_url;
	
	public static void setUp() throws Exception{
		File pathToBinary = new File(Util.FIREFOX_PATH);
		FirefoxBinary fbinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile profile = new FirefoxProfile();
		driver = new FirefoxDriver(fbinary,profile);
		base_url= Util.BASE_URL;
		driver.get(base_url);
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME,TimeUnit.SECONDS);
		
	}
	
	public static void main(String[] args){
		try{
			setUp();
		}catch(Exception e){e.printStackTrace();}
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		/*WebElement td_Home = driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));*/
		String bgcolor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgcolor);
		//going to perform actions on the driver(associating the driver to perform actions)
		Actions builder = new Actions(driver);
		//specifying which action to be performed-defining action
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		
		//Perform the action
		mouseOverHome.perform();
	    bgcolor = td_Home.getCssValue("background-color");
	    System.out.println("After hover: " + bgcolor);
	    driver.quit();
		
		
		
		}
	}
	 
	
	

