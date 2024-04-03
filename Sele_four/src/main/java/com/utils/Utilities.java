package com.utils;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	
	WebDriver driver=null;
	
	
	public WebDriver register() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		return driver;
	}

	public void sendKeys(WebElement ele, String keysToSend) {
		if(ele.isDisplayed() && ele.isEnabled()) {
			ele.clear();
			try {
			ele.sendKeys(keysToSend);
			}catch(IllegalArgumentException exe) {
				System.out.println("Dont enter null values");
			}
		}
	}

	public void click(WebElement ele) {

		try {
			ele.click();
		}catch(StaleElementReferenceException exe) {
			System.out.println("Element is not attached to DOM");
	}
	}
	
	public void radioBtn(List<WebElement> eles,String chkValue) {
		for(WebElement ele:eles) {
			System.out.println("ele:: "+ele.getAttribute("value"));
			if(ele.getAttribute("value").equalsIgnoreCase(chkValue))
				ele.click();
			break;
		}
	}
	public void chkboxBtn(List<WebElement> eles,List<String> chkValues) {
		for(String chkValue:chkValues) {
			for(WebElement ele:eles) {
				if(ele.getAttribute("value").equalsIgnoreCase(chkValue)) {
					ele.click();
					break;
				}
			}
		}
	}
	
	public void drpbox(WebElement drp,String value){
		Select sel=new Select(drp);
		sel.selectByValue(value);
		
	}
//	public void dropdown(Select sel,String value) {
//		sel.selectByValue(value);
////		sel.selectByIndex(1);
//	}
public void selectByVisibleText(WebElement ele,List<String> text) {
	Select select=new Select(ele);
	if(!select.isMultiple()) {
	try {	
	select.selectByVisibleText(text.get(0));
	}catch(NoSuchElementException exe) {
		System.out.println("option is not present in dropdpown");
	}
	
	}
	else {
		for(String txt:text) {
			try {
				select.selectByVisibleText(txt);
			}catch(NoSuchElementException exe) {
				System.out.println("option is not present in dropdpown");
			}
			
		}
	}
	
	
}
	
	
	
}
