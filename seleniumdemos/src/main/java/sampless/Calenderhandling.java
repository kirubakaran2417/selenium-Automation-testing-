package sampless;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.BaseUI;

public class Calenderhandling extends BaseUI{
public static void main(String[] args) throws InterruptedException, IOException {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the month you want to travel");
	String month=s.nextLine();
	driver=BrowserConfiguration.browserSetup("https://www.ixigo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//to taake screenshot
	TakesScreenshot takescr=((TakesScreenshot) driver);
	File src=takescr.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\Workspaces\\Techforum5\\SeleniumDemos\\screenshots\\aa.jpg"));
	
	driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys("chennai");
	driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys("bangalore");
	Thread.sleep(1000);

	driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys(Keys.ENTER);
	//	driver.findElement(By.xpath("(//div[@class='c-input-cntr']//input)[2]")).sendKeys("bangalore");
	  while(true) {
		  
      	String mon_text=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
          String[] mon=mon_text.split(" ");
      	if(mon[0].equalsIgnoreCase(month)) {
      		break;
      	}else {
      		
      		driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
      	}
      }
	  
	  List<WebElement> dates=driver.findElements(By.cssSelector("div.day.has-info"));
	  for (int i = 0; i < dates.size(); i++) {
		  Thread.sleep(500);
		String datetext=dates.get(i).getText();
		if(datetext.equalsIgnoreCase("17")) {
			dates.get(i).click();
			break;
		}
		
	}
	  
	  WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(20));

//	  Thread.sleep(3000);
	  JavascriptExecutor js=(JavascriptExecutor) driver;
//
	  WebElement cl=driver.findElement(By.cssSelector("div.close-btn.u-pos-abs.ixi-icon-cross"));
	  waits.until(ExpectedConditions.elementToBeClickable(cl));
	  Actions a=new Actions(driver);
	  a.moveToElement(cl).click(cl).build().perform();

	
	  WebElement returncity = driver.findElement(By.xpath("//input[@placeholder='Return']"));
	  waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Return']")));
	  returncity.click();
	  returncity.click();

	  
      
	  while(true) {
		  
	      	String mon_text=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
	          String[] mon=mon_text.split(" ");
	      	if(mon[0].equalsIgnoreCase("JULY")) {
	      		break;
	      	}else {
	      		WebElement arrow=driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']"));
	      		js.executeScript("arguments[0].click();", arrow);
	      }
		  
		  List<WebElement> dates2=driver.findElements(By.cssSelector("div.day.has-info"));
		  for (int i = 0; i < dates2.size(); i++) {
			  Thread.sleep(500);
			String datetext=dates2.get(i).getText();
			if(datetext.equalsIgnoreCase("17")) {
				dates2.get(i).click();
				break;
			}
			
		}
	

}
}}
