package actionsclasspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDragAndDrop
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\eclipse\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Droppable']")));
		WebElement e1=driver.findElement(By.xpath("//*[text()='Droppable']"));
		Actions a=new Actions(driver);
		a.click(e1).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Droppable']")));
		driver.switchTo().frame(0);
		WebElement e2=driver.findElement(By.id("draggable"));
		WebElement e3=driver.findElement(By.id("droppable"));
		a.dragAndDrop(e2, e3).build().perform();
		String result=driver.findElement(By.xpath("//*[@id='droppable']/child::*")).getText();
		if(result.contains("Dropped"))
		{
			System.out.println("Drag and drop test passed");
		}
		else
		{
			System.out.println("Drag and drop test failed");
		}
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		//close site
		driver.close();
	}
}
