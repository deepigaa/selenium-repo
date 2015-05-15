package myPackage;

import mercuryTours.Util;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Firefox {
	public static WebDriver driver;
	public static String base_Url;
	public static void setUp() throws Exception{
		File pathToBinary = new File(Util.FIREFOX_PATH);
		FirefoxBinary fbinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile profile = new FirefoxProfile();
		driver = new FirefoxDriver(fbinary,profile);
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME,TimeUnit.SECONDS);
	}

}
