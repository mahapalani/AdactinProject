package Base_Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriver getBrowser(String type)	{
		if (type.equalsIgnoreCase("chromedriver")) {
							System.setProperty("webdriver.chrome.driver","C:\\Users\\Bala\\eclipse-workspace\\Selenium MiniProject\\driver\\chromedriver.exe");
							 driver = new ChromeDriver();		
			}
			else if (type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//gecko.exe");
				 driver = new FirefoxDriver();
			}
		return driver;
	}
	public static void url(String url) {
	driver.get(url);
	}
    public static void clickOnElement(WebElement element) {
    	element.click();
	}
	public static  void inputValueElement(WebElement element , String value) {
		element.sendKeys(value);
	}
	public static void timeout(int waitime) {
		driver.manage().timeouts().implicitlyWait(waitime, TimeUnit.SECONDS);
	}
	public static void sleep(long millions) throws Throwable {
		Thread.sleep(millions);
	}
	public  static void close() {
		driver.close();

	}
   public static void DropDown(WebElement element, String value, String i) {
		Select s = new Select(element);
		if (value.equalsIgnoreCase("byvalue")) {
			s.selectByValue(i);
	}
		else if (value.equalsIgnoreCase("bytext")) {
			s.selectByVisibleText(i);
	}
		else if (value.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(i);
			s.selectByIndex(index);
		}
		}
	public static void getAttributeValue(WebElement element , String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("page title : "+ title);
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
	}
	public static void takeScreenshot(String location) throws IOException {
		TakesScreenshot js = (TakesScreenshot)driver;
		File s = js.getScreenshotAs(OutputType.FILE);
		File s1 = new File(location);
		Files.copy(s,s1);

	}
	
	}
		
		



