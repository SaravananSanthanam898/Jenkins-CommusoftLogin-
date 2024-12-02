package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends Login{
	
	public void ExplicitWait_PresenceOfEle2(String xpath) 
	{
		WebDriverWait wait=new WebDriverWait(driverWeb, 40);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
	}

}
