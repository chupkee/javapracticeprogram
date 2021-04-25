package actionsclasspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClasssMoveToElement 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait=null;
		try
		{
			wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_2KpZ6l _2doB4z']")));
			if(driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).isDisplayed())
			{
				driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Banner was not displayed");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Mobiles']")));
		WebElement e=driver.findElement(By.xpath("//*[text()='Mobiles']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		
		
		
		
		//close site
		driver.close();
	}
}
