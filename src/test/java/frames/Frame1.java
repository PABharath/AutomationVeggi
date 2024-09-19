package frames;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Frame1 {
	WebDriver driver;
	public Frame1(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
//	driver.findElement(By.cssSelector("[alt*='Cart']")).click();
//	
//	driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
//	t<WebElement> names=driver.findElements(By.xpath("//div[@class='product']/h4"));
	@FindBy(xpath="//div[@class='product']/h4") 
	List<WebElement> names;
	
	
	@FindBy (css="[alt*='Cart']")
	WebElement clickoncart;
	
	@FindBy (xpath="//div[@class='action-block']/button")
	WebElement proceed;
	
	public List<WebElement> alldata() {
		return names;
	}
	
	public void click(String[] ProductNames) {
		for(int i=0;i<names.size();i++) {
			String[] name=names.get(i).getText().split("-");
			String Exactname=name[0].trim();
			
			 List al = Arrays.asList(ProductNames);
		     
		     int j=0;
		     if(al.contains(Exactname)) {
		    	 
		    	 driver.findElements(By.cssSelector(".product-action button")).get(i).click();
		    	 j++;
		    	 
		    	 if(j==ProductNames.length) {
		    		 
		    	 }
		     }
		
		}
	}
	
	@Test(dependsOnMethods= {"click"})
	public void clikingactions() {
	clickoncart.click();
	proceed.click();
	}
	

}
