package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class i2{
    WebDriver driver;

    // Method 1: mở chrome
    @BeforeTest
    public void openchrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://dangky.tlu.edu.vn/CMCSoft.IU.Web.Info/Home.aspx");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void dangnhap2() {
    }
    @Test(priority = 0)
    public void inra2(){
        System.out.println("hello");
    }



    @AfterTest
    public void thoat2(){
//        driver.close();
    }

}