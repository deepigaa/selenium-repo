package guruBanking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.demo.guru99.com/V4/";
		driver.get(baseURL);
		WebElement userName = driver.findElement(By.name("uid"));
		userName.sendKeys("mngr10070");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("bytAhur");
		driver.findElement(By.name("btnLogin")).click();
		
		
		
	}

}
