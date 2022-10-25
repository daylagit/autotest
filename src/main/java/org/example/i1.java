package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class i1{
    WebDriver driver;

    // Method 1: mở chrome
    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://dangky.tlu.edu.vn/CMCSoft.IU.Web.Info/Home.aspx");
        driver.manage().window().maximize();
    }
    @Test
    public void dangnhap() {
        driver.findElement(By.xpath("//a[@id='PageHeader1_SignOut_ibnLogout']")).click();
        driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("1651170912");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("12091997u");
        driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
    }
@Test
public void inra(){
        System.out.println("hello");
}



    @AfterTest
    public void thoat(){
        driver.close();
    }

}