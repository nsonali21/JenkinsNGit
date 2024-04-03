import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bGColorPropChange {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	WebElement switchTo=driver.findElement(By.linkText("SwitchTo"));
	String bgColor=switchTo.getCssValue("background-color");
	System.out.println("BG COLOR Before hover:: "+bgColor);
	
	Actions action=new Actions(driver);
	action.moveToElement(switchTo).build().perform();
	String bgColorNew=switchTo.getCssValue("background-color");
	System.out.println("BG COLOR Before hover:: "+bgColorNew);
	
//	action.mo
}
}
