package com.tessting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assument {


    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void PassSign() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.yammer.com/signup";
        driver.get(URL);

        WebElement email = driver.findElement(By.id("user_email"));
        email.sendKeys("hamzach625@gmail.com");
        sleep(500);

        WebElement clicks = driver.findElement(By.xpath("//button[@class='yj-btn  yj-btn-secondary ']"));
        clicks.click();
        sleep(2500);
        WebElement success = driver.findElement(By.xpath("//div[@class='zindex-t4 yj-alert yj-error yj-show-alert']/p"));

        String expected = "That looks like a personal email address. Please use your company email address so we can securely connect you with your network.";
        String actual = success.getText();
        Assert.assertEquals(actual,expected,"Failed");
        sleep(1000);
        driver.quit();
    }





    @Test
    public void FailSign() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.yammer.com/signup";
        driver.get(URL);

        WebElement email = driver.findElement(By.id("user_email"));
        email.sendKeys("hamzach625@gmail.com");
        sleep(500);

        WebElement clicks = driver.findElement(By.xpath("//button[@class='yj-btn  yj-btn-secondary ']"));
        clicks.click();
        sleep(2500);
		String expectedURL = "https://www.yammer.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Failed ");
        sleep(1000);
        driver.quit();
    }






    @Test
    public void PassLog() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.yammer.com/login?locale=en-US&locale_type=standard";
        driver.get(URL);

        WebElement email = driver.findElement(By.id("login"));
        email.sendKeys("hamzach625@gmail.com");
        sleep(500);

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("hamzach625@gmail.com");
        sleep(500);

        WebElement clicks = driver.findElement(By.xpath("//button[@class='yj-btn  yj-btn-secondary ']"));
        clicks.click();
        sleep(2500);
        WebElement success = driver.findElement(By.xpath("//div[@class='zindex-t4 yj-alert yj-error yj-show-alert']/p"));

        String expected = "Incorrect user name or password";
        String actual = success.getText();
        Assert.assertEquals(actual,expected,"Failed");
        sleep(1000);
        driver.quit();
    }






    @Test
    public void PassFail() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.yammer.com/login?locale=en-US&locale_type=standard";
        driver.get(URL);

        WebElement email = driver.findElement(By.id("login"));
        email.sendKeys("hamzach625@gmail.com");
        sleep(500);

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("hamzach625@gmail.com");
        sleep(500);

        WebElement clicks = driver.findElement(By.xpath("//button[@class='yj-btn  yj-btn-secondary ']"));
        clicks.click();
		sleep(2500);
		String expectedURL = "https://www.yammer.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Failed ");
        sleep(1000);
        driver.quit();
    }


}
