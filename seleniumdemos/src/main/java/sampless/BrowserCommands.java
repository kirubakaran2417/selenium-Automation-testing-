package sampless;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;

import com.example.BaseUI;

public class BrowserCommands extends BaseUI{

	static By dropdown=By.id("q4");
	static By subject=By.id("subject");
	static By radio=By.xpath("//input[@value='Fourth Option']");
	static By checkbox=By.xpath("//input[@type='checkbox']");
	
	
	public static void main(String[] args) {
		driver=BrowserConfiguration.browserSetup("https://www.amazon.in");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();//driver.quit();
		driver.navigate().to("https://www.mycontactform.com");
		//locators
		driver.findElement(By.linkText("Sample Forms")).click();
		
		//driver.findElement(By.id("subject")).sendKeys(Keys.ENTER);
		//for handling dropdown use select class
//		sendtexttofield(subject, "kiruba");
//		dropdown(dropdown, "Third Option");
//		clickElement(radio);
		
		List<WebElement> checkboxes=driver.findElements(checkbox);
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
	}
}
