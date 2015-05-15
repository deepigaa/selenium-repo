package mercuryTours;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestInputBox {
	public static void main(String[] args){
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.newtours.demoaut.com");
		 WebElement userElement = driver.findElement(By.name("userName"));
		 userElement.sendKeys("tutorial");
		 WebElement passElement = driver.findElement(By.name("password"));
		 passElement.sendKeys("tutorial");
		 WebElement signElement = driver.findElement(By.name("login"));
		 signElement.click();
		 WebElement typeElement = driver.findElement(By.cssSelector("input[value = 'oneway']"));
		 typeElement.click();
		 Select drpPassenger = new Select(driver.findElement(By.name("passCount")));
		 drpPassenger.selectByVisibleText("2");
		 Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		 fromPort.selectByValue("London");
		 Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
		 fromMonth.selectByIndex(4);
		 Select fromDay = new Select(driver.findElement(By.name("toDay")));
		 fromDay.selectByValue("21");
		 Select toPort = new Select(driver.findElement(By.name("toPort")));
		 toPort.selectByValue("New York");
		 Select toMonth = new Select(driver.findElement(By.name("toMonth")));
		 toMonth.selectByIndex(7);
		 Select toDay = new Select(driver.findElement(By.name("toDay")));
		 toDay.selectByValue("11");
		 WebElement servElement = driver.findElement((By.cssSelector("input[value = 'Business']")));
		 servElement.click();
		 Select airline = new Select(driver.findElement(By.name("airline")));
		 airline.selectByVisibleText("Blue Skies Airlines");
		 WebElement findFlights= driver.findElement(By.name("findFlights"));
		 findFlights.click();
		 WebElement reserveFlights = driver.findElement(By.name("reserveFlights"));
		 reserveFlights.click();
		 WebElement firstName = driver.findElement(By.name("passFirst0"));
		 firstName.sendKeys("Deepigaa");
		 WebElement lastName = driver.findElement(By.name("passLast0"));
		 lastName.sendKeys("Gayathri");
		 WebElement creditNumber = driver.findElement(By.name("creditnumber"));
		 creditNumber.sendKeys("1235678");
		 WebElement buyFlights = driver.findElement(By.name("buyFlights"));
		 buyFlights.click();
		 
		 
		 
		 }

}
