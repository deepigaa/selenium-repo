package mercuryTours;

import java.util.concurrent.TimeUnit;
import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Login {
	static WebDriver driver;
	static String base_url;
	
	public static void setUp() throws Exception{
		//retrieving the Firefox_path from the Util file
		File pathToBinary = new File(Util.FIREFOX_PATH);
		//locating the Firefox Binary file
		FirefoxBinary fbinary = new FirefoxBinary(pathToBinary);
		//creating a Firefox profile
		FirefoxProfile profile = new FirefoxProfile();
		//Associating the driver with firefox binary and profile
		driver = new FirefoxDriver(fbinary,profile);
		base_url = Util.BASE_URL;
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);	
		driver.get(base_url);
	}
     public static void main(String[] args){
    	 String actualTitle;
    	 try{
    		 setUp();
    	 }catch(Exception e){e.printStackTrace();}
    	 driver.findElement(By.name("userName")).sendKeys(Util.username);
    	 driver.findElement(By.name("password")).sendKeys(Util.password);
    	 driver.findElement(By.name("login")).click();
    	 actualTitle = driver.getTitle();
    	 if (actualTitle.equals(Util.Expected_title)){
    		 System.out.println("Test Passed");
    		 System.out.println(actualTitle);
    	 }
    	 else{
    		 System.out.println("Test Failed");
    		 System.out.println(actualTitle);
    	 }
    	 driver.close();
    }
      
    	 
}

