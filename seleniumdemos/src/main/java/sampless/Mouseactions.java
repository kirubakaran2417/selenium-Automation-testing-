package sampless;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions extends BaseUI{

	public static void main(String[] args) {
		driver=BrowserConfiguration.browserSetup("https://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.click(droppable)
//		a.moveToElement(x).build().perform()

		Alert a=driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys(null)//
		a.getText()
	}
}
