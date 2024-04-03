package com.utils;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class CompleteForm {
	//	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")
	//	static
	//	WebElement fname;
	//	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		Utilities util=new Utilities();
		driver=util.register();
		Thread.sleep(3000);
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		util.sendKeys(fname, "Soni");

		WebElement lname=driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		util.sendKeys(lname, "Naik");

		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		util.sendKeys(address,"Aundh Pune");

		WebElement email=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		util.sendKeys(email, "mnp@gmail.com");

		WebElement tele=driver.findElement(By.xpath("//input[@type='tel']"));
		util.sendKeys(tele, "35629712");

		List <WebElement> gender=driver.findElements(By.xpath("//input[@type='radio']"));
		//		System.out.println(gender.size());
		util.radioBtn(gender, "Male");

		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		List<String> chkoptn=new ArrayList<String>();
		chkoptn.add("Movies");
		chkoptn.add("Cricket");
		util.chkboxBtn(checkbox, chkoptn);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		//		Select skills=new Select(driver.findElement(By.id("Skills")));
		//		util.dropdown(sel,"Certifications");
		//		 List<WebElement> options=skills.getOptions();
		List<String> optnskill=new ArrayList<String>();
		optnskill.add("Adobe InDesign");
		optnskill.add("Android");
		WebElement skills=driver.findElement(By.id("Skills"));
		util.selectByVisibleText(skills,optnskill);
		//		System.out.println("SIZE OF skills optn:: "+options.size());


		WebElement drpYear=driver.findElement(By.id("yearbox"));
		List<String> year=new ArrayList<String>();
		year.add("1995");
		util.selectByVisibleText(drpYear, year);



		/*	
		WebElement drpMonth=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
//		Select selMonth=new Select(drpMonth);
//		util.dropdown(selMonth, "January");
		util.drpbox(drpMonth, "January");

		WebElement drpDay=driver.findElement(By.xpath("//select[@ng-model='daybox']"));
//		Select selDay=new Select(drpDay);
//		util.dropdown(selDay, "6");
		util.drpbox(drpDay, "6");

//		util.drpbox(WebElement drp, String value);
		 */
	}

}
