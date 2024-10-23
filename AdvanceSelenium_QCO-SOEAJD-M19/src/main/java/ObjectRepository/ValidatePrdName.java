package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidatePrdName {

	public ValidatePrdName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePrd(WebDriver driver,String PrdName )
	{
		return driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
		 

//		if (actData.equals(PrdName)) {
//			System.out.println("Product Name is Created");
//		} else {
//			System.out.println("Product name is not created");
//		}
	}
}
