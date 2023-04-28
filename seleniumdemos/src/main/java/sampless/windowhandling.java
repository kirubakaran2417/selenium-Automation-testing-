package sampless;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.BaseUI;

public class windowhandling extends BaseUI{

	public static void main(String[] args) throws InterruptedException {
		driver=BrowserConfiguration.browserSetup("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("span.logSprite.icClose")).click();
		WebElement fromcity=driver.findElement(By.xpath("(//div[@class=\"sc-gGCDDS eaLCwN fswFld \"])[1]"));
		fromcity.click();
		WebElement fromtext= driver.findElement(By.xpath("//div[@class='sc-fbyfCU hGhHkx']//input"));
		fromtext.sendKeys("mumbai");
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
		waits.until(ExpectedConditions.visibilityOf(fromtext));
				
		fromtext.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class=\"sc-gGCDDS eaLCwN fswFld \"])[2]")).click();
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> windows=driver.getWindowHandles();
//		List<String> windowslist=new ArrayList<>(windows);//conversion of set to list
//		WebElement links=driver.findElement(By.linkText("Basic Contact Form"));
////		Actions a=new Actions(driver);
////		a.contextClick(links).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//		String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
//		links.sendKeys(clicklink);
//		
//		Thread.sleep(3000);
//		
//		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));
//		waits.until(ExpectedConditions.visibilityOf(links));
//		
//		links.sendKeys("mumbai");
//		links.sendKeys(Keys.ENTER);
		
	}
}
