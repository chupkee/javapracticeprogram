package failuremindtree;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartSiteOpenandClose
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_2KpZ6l _2doB4z']"))).click();
		Thread.sleep(3000);
		String x=driver.getTitle();
		System.out.println("site title"+ x);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Top Offers']"))).click();
		Thread.sleep(2000);
		driver.close();
	}
}
