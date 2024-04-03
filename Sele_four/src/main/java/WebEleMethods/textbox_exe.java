package WebEleMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class textbox_exe {
	WebDriver driver=null;
@BeforeSuite
public void setting() {
	driver=new ChromeDriver();
//	driver=new FirefoxDriver();

	driver.get("https://demo.automationtesting.in/Register.html");
	
}

/*
@Test(priority=1)
public void textbox_meth() {
	WebElement fname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	System.out.println("getDOM Attribute:: "+fname.getDomAttribute("class"));
	System.out.println("getAttribute:: "+fname.getAttribute("class"));
	System.out.println("get Aria of textbox:: "+fname.getAriaRole());//o/p: textbox
	System.out.println("get CssVAlue:: "+fname.getCssValue("border-color"));
	System.out.println("getDomProperty:: "+fname.getDomProperty("class"));//???????????ask
	System.out.println("Tag Name:: "+fname.getTagName());
	
	System.out.println("text:: "+fname.getText());
	
//	System.out.println("gettext:: "+fname.getAttribute("innerText")); printing blank bcz FullName is label not webelemnt i.e FirstName,last anme
	
	System.out.println("isdisplayed::"+fname.isDisplayed());
	System.out.println("isEnabled:: "+fname.isEnabled());
	System.out.println("isSelected:: "+fname.isSelected());
//	System.out.println("toString meth:: "+fname.toString());
	fname.clear();
//	fname.click();
//	fname.sendKeys(null);//illegal Argument Exception
	fname.sendKeys("");//no error
	fname.sendKeys("123456");
	fname.clear();
	fname.sendKeys("amol");
}

*/
//@Test
//public void textArea() {
//	WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
//	
//}//similar to textbox

/*
@Test
public void emailVal() {
	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("");
	email.clear();
	
	email.sendKeys("avbc");
	System.out.println(email.getSize());
	
	email.clear();
	email.sendKeys("123@gmail.com");
	email.clear();
	email.sendKeys("12456");
	
	System.out.println("isdisplayed::"+email.isDisplayed());
	System.out.println("isEnabled:: "+email.isEnabled());
	System.out.println("isSelected:: "+email.isSelected());
	
}
*/
/*
@Test
public void telephone() {
	WebElement tele=driver.findElement(By.xpath("//input[@type='tel']"));
	tele.sendKeys("");
	tele.sendKeys("213564789333");
	tele.clear();
	tele.sendKeys("abcd");
	
}
*/

/*
@Test
public void radioBtn() {
	WebElement gender=driver.findElement(By.xpath("//input[@value='FeMale']"));
//	gender.clear();//giver exeptn: InvalidElementStateException:
//	gender.sendKeys("Xsfg");//no error
	gender.click();
}
*/

@Test(priority=2)
public void gender_op() {
	WebElement chbox1=driver.findElement(By.id("checkbox1"));
	chbox1.click();
//	chbox1.clear();//gives InvalidElementStateException
//	chbox1.getShadowRoot();check meaning
	System.out.println("Aria of check box:: "+chbox1.getAriaRole());
	System.out.println("gt text:: "+chbox1.getText().toString());
	System.out.println("not text but its label:: "+driver.findElement(By.xpath("//div//input[@id='checkbox1']//following-sibling::label")).getText());
	
}
}
