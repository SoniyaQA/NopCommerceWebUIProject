package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    // @FindBy(xpath = "//input[@type='checkbox']/following-sibling::span[@class='cb-i']")
    WebElement clickHuman;

    public void clickOnIAmHuman() {
//        Thread.sleep(3000);
//        WebElement humanButton = driver.findElement(By.id("//input[@type='checkbox']/following-sibling::span[@class='cb-i']")); // Use the correct locator
//        humanButton.click();

        clickOnElement(clickHuman);
    }

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement register;

    public void clickOnRegister() {
        clickOnElement(register);

    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegister;


    public String verifyRegisterText() {
        return getTextFromElement(verifyRegister);

    }
}
