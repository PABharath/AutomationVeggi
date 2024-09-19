package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Frame3 {
	
	WebDriver driver;
	public Frame3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
//	WebElement check=	driver.findElement(By.cssSelector(".chkAgree"));
//	
//	check.click();
//	
//	driver.findElement(By.cssSelector(".wrapperTwo button")).click();
	
	@FindBy(css=".wrapperTwo select")
	WebElement tag;
	
	@FindBy(css=".chkAgree")
	WebElement check;
	
	@FindBy (css=".wrapperTwo button")
	WebElement finalword;
	
	public void visibletext(String text) {
       Select tagname=new Select(tag);
		tagname.selectByVisibleText(text);
		check.click();
		finalword.click();
		
	}

	

}
