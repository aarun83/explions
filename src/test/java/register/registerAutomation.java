package register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registerAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khelmart.com/");
		
		Actions action = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' My account']")));
		element1.click();
//		action.moveToElement(driver.findElement(By.xpath("//a[text()=' My account']"))).perform();
//		action.moveToElement(driver.findElement(By.xpath("//div[text()='IT jobs']"))).click().build().perform();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[text()=' My account']")).click();
		
		
//			@FindBy(xpath="//div[@class='account-wrapper']")
//			public WebElement account;
//			@FindBy(xpath="//a[text()=' My account']")
//			public WebElement myAccount;
//			@FindBy(xpath="//div[@class='block block-new-customer']/div/div/div/a[@class='action create primary']")
//			public WebElement newCustomer;
//			@FindBy(id="firstname")
//			public WebElement firstname;
//			@FindBy(id="lastname")
//			public WebElement lastname;
//			@FindBy(id="email_address")
//			public WebElement email;
//			@FindBy(id="password")
//			public WebElement password;
//			@FindBy(id="password-confirmation")
//			public WebElement cpassword;
//			@FindBy(id="send2")
//			public WebElement createAccount;
			

	}

}
