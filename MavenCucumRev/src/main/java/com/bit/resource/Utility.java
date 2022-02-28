package com.bit.resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {
	WebDriver dr;
	public Utility(WebDriver dr) {
		this.dr = dr;
		
	}
public void getUrl(String url) {
	dr.get(url);
}
 public void clickOnElement() {
	 dr.findElement(By.xpath("")).click();
 }
 public void type() {
	 	
 }
}
