package mainFramee;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import frames.Frame1;
import frames.Frame2;
import frames.Frame3;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	@Test
	public void add() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] ProductNames= {"Brocolli","Carrot","Capsicum"};
		Frame1 data=new Frame1(driver);
		List <WebElement>names=data.alldata();
		data.click(ProductNames);
		data.clikingactions();
		
		Frame2 data1=new Frame2(driver);
		data1.placeorder("rahulshettyacademy");
		
		Frame3 data2=new Frame3(driver);
		data2.visibletext("Belize");
		
		


		

	    
	
	}

}
