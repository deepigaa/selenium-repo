package myPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypingKeys {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));//the element is the element with the name "q"
		element.sendKeys("Cheese!");
		element.submit();
		System.out.println("Page title is: " +driver.getTitle());
		//google search is rendered dynamically using JavaScript
		//wait for the page timeout after 10 seconds
		try{
			(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
				public Boolean apply(WebDriver d){
					//return d.getTitle().startsWith("Cheese!");
					return d.getTitle().toLowerCase().startsWith("cheese!");
				}
			});
		}catch(Exception e){e.printStackTrace();}
		System.out.println("Page title is: " +driver.getTitle());
	driver.close();
	}

}
