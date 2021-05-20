package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseclassCucumber {
	
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		
			try {
				if (browserName.equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\user\\eclipse-workspace\\Adactincucumber\\driver\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browserName.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver",
							"C:\\Users\\admin\\eclipse-workspace\\SeleniumProject1\\Driver\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				} else if (browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver",
							"C:\\Users\\admin\\eclipse-workspace\\SeleniumProject1\\Driver\\geckoDriver.exe");
					driver = new FirefoxDriver();
				} else {
					System.out.println("Invalide browsername");
				}
				driver.manage().window().maximize();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return driver;
	}

	public static void navigateto(String Url) {
		try {
			driver.navigate().to("");;
		} catch (Exception e) {

		}

	}

	public static void navigateback() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateforward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {

		}

	}

	public static void navigaterefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {

		}
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getTitle() {
		try {
			driver.getTitle();
		} catch (Exception e) {

		}
	}

	public static void getAttribute(By bySearchButton) {
		WebElement element = driver.findElement(bySearchButton);
		System.out.println(element);

	}

	public void getCurrentUrl(String Currenturl) {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {

		}

	}

	public static void getText() {
		try {

		} catch (Exception e) {

		}
	}

	public static void dropDownSelection(WebElement element, String option, String input) {
		Select s = new Select(element);
		if (option.equals("index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);

		} else if (option.equals("value")) {
			s.selectByValue(input);
		}

		else if (option.equals("text")) {
			s.selectByVisibleText(input);
		}
	}//0  1   2

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputText(WebElement element, String inputvalue) {
		element.sendKeys(inputvalue);
	}

	public static void isEnabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {

		}

	}

	public static void IsDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {

		}

	}

	public static void isSelected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {

		}

	}

	public static void simplealert() {
		try {
			Alert simplealert = driver.switchTo().alert();
			simplealert.accept();

		} catch (Exception e) {

		}

	}

	public static void comfirmalert() {
		try {
			Alert confirmalert = driver.switchTo().alert();
			confirmalert.accept();

		} catch (Exception e) {

		}

	}

	public static void promptalert() {
		try {
			Alert promptalert = driver.switchTo().alert();
			promptalert.accept();

		} catch (Exception e) {

		}

	}

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
		}

	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
		}

	}

	public static void dragdrop(WebElement drag, WebElement drop) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(drag, drop).build().perform();

		} catch (Exception e) {
		}

	}
	public static void action(WebElement element) {
		Actions ac = new Actions (driver);
		ac.moveToElement(element);
	}
	

	public static void Frames(WebElement iframe) {
			iframe.click();
			driver.switchTo().frame(0);

		} 
		

	

	public static void takesScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(
				"C:\\Users\\user\\eclipse-workspace\\Adactincucumber\\screenshot\\p1.png");
		FileUtils.copyFile(srcfile, destfile);

	}

	public static void dropdownselection(WebElement element, String option, String Value, String input) {
		Select s = new Select(element);

		if (option.equals("index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);

		} else if (option.equals("value")) {
			s.selectByValue(input);
		} else if (option.equals("text")) {
			s.selectByVisibleText(input);

		}
	}

	public static void implicitwait() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (Exception e) {

		}
	}

	public static void explicitwait(long seconds, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {

		}
	}
	
	//public static void fluentwait() {
	//FluentWait wait = new FluentWait (driver).withTimeout(30,Timeunit.seconds).

	public static void windowshandling() {
		try {
			driver.getWindowHandles();
		} catch (Exception e) {

		}
	}

	public static void robot(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public void getSelected() {

		Select select = new Select(driver.findElement(By.xpath("//select")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		
	}

	
	
	
	


}

	  
	
	
	
	
	


