package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTests extends TestBase{
    @Test
    public void createNewAccount() throws InterruptedException{

    WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

    WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(randomEmail());


    WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

    WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

    WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        Thread.sleep(15000);


    WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        menuButton.click();

    WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        Thread.sleep(3000);


}

    public CharSequence randomEmail(){
        Random ran = new Random();
        int r = ran.nextInt(9999);
        return ("anna" + r + "@gmail.com");

    }
}
