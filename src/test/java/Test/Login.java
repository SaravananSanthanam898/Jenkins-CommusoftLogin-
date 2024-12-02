package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public WebDriver driverWeb;
	
	
	@Test
	public void ConnectWeb() throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().driverVersion("127.0.6533.43").setup(); 
		driverWeb=new ChromeDriver();
		driverWeb.get("https://app.commusoft.co.uk/");
		driverWeb.manage().window().maximize();
		driverWeb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		 
		 Utility utility = new Utility();
//		 utility.ExplicitWait_PresenceOfEle2("//input[@id='logintype_clientid']");
		 Thread.sleep(2000);
         WebElement UserID = driverWeb.findElement(By.xpath("//input[@id='logintype_clientid']"));
//         utility.ExplicitWait_PresenceOfEle2("//input[@id='logintype_username']");
         Thread.sleep(2000);
         WebElement UserName = driverWeb.findElement(By.xpath("//input[@id='logintype_username']"));
//         utility.ExplicitWait_PresenceOfEle2("//input[@id='logintype_password']");
         Thread.sleep(2000);
         WebElement UserPassword = driverWeb.findElement(By.xpath("//input[@id='logintype_password']"));
         

         // Enter the credentials and submit the form
         driverWeb.findElement(By.xpath("//input[@id='logintype_clientid']")).click();
        
         UserID.sendKeys("16410");
         
         UserName.sendKeys("Saravanan");
        
         UserPassword.sendKeys("demo123");
         UserPassword.submit();
        
        System.out.println("Jenkin succesfully builded");
  
		
	}

}
