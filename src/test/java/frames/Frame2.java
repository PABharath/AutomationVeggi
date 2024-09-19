package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame2 {
	WebDriver driver;
	public Frame2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	
	
	@FindBy(css=".promoCode")
	WebElement sendata;
	
	@FindBy(css=".promoBtn")
	WebElement clickpromo;
	
	
	@FindBy(css=".products button:nth-last-child(1)")
	WebElement clickplace;
	
	public void placeorder(String user) throws InterruptedException {
		sendata.sendKeys(user);
		clickpromo.click();
		Thread.sleep(3000);
		clickplace.click();
	}
	
}
