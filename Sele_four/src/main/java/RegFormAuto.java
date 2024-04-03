import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.utils.Utilities;

import bsh.util.Util;

public class RegFormAuto {
	Utilities util=new Utilities();;
	
	
    @FindBy(xpath="//input[@placeholder='First Name']")
	 WebElement fName;
    
    
    @FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lName;
  
    
    @Test
   public void ref(){
    	System.out.println("hello...........");
//       util.sendKeys(fName, "Harsha");  
    	util.register();
    	util.sendKeys(fName, "Harsha");  
   }
  
	}
 
 

