package avalon.com.sak;

import java.util.concurrent.TimeUnit;
import org.openqa. selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class Testnew {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver 2");
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		
		c.get("https://chapp1.herokuapp.com/");
		Thread.sleep(1000);
		WebElement myact1=c.findElement(By.name("name"));
		myact1.sendKeys("saket");
		Thread.sleep(1000);
		WebElement myact2=c.findElement(By.name("room"));
		myact2.sendKeys("scenes");
		Thread.sleep(1000);
		WebElement myact3=c.findElement(By.xpath("//button[text ()='Join']"));
		myact3.click();
	
		
//		2nd user
		System.setProperty("webdriver.chrome.driver","/Users/saketkumar/Downloads/selenium/chromedriver 2");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		
		d.get("https://chapp1.herokuapp.com/");
		Thread.sleep(1000);
		WebElement myac1=d.findElement(By.name("name"));
		myac1.sendKeys("second user");
		Thread.sleep(1000);
		WebElement myac2=d.findElement(By.name("room"));
		myac2.sendKeys("scenes");
		Thread.sleep(1000);
		WebElement myac3=d.findElement(By.xpath("//button[text ()='Join']"));
		myac3.click();
		Thread.sleep(1000);
		
//		1st user
		WebElement myact4=c.findElement(By.id("message-box"));
		myact4.sendKeys("hey saket here");
		Thread.sleep(1000);
		WebElement myact5=c.findElement(By.id("send-message"));
		myact5.click();
		Thread.sleep(1000);
		
//		2st user
		WebElement myac4=d.findElement(By.id("message-box"));
		myac4.sendKeys("hey 2nd user here");
		Thread.sleep(1000);
		WebElement myac5=d.findElement(By.id("send-message"));
		myac5.click();
		Thread.sleep(1000);
		
//		1st user
		WebElement myact6=c.findElement(By.id("message-box"));
		myact6.sendKeys("project");
		Thread.sleep(1000);
		WebElement myact7=c.findElement(By.id("send-message"));
		myact7.click();
		Thread.sleep(1000);
		
//		2st user
		WebElement myac6=d.findElement(By.id("message-box"));
		myac6.sendKeys("this is my test project");
		Thread.sleep(1000);
		WebElement myac7=d.findElement(By.id("send-message"));
		myac7.click();
		Thread.sleep(1000);
		
		c.quit();
		d.quit();
			
		
	}

}
