package org.example;// Generated by Selenium IDE

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Wiki1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\blalvare\\OneDrive - Capgemini\\Desktop\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void wiki1() {
    // Test name: wiki1
    // Step # | name | target | value
    // 1 | open | /wiki/Wikipedia:Portada | 
    driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    // 2 | setWindowSize | 793x824 | 
    driver.manage().window().setSize(new Dimension(793, 824));
    // 3 | click | id=searchInput | 
    driver.findElement(By.id("searchInput")).click();
    // 4 | type | id=searchInput | software
    driver.findElement(By.id("searchInput")).sendKeys("software");
    // 5 | sendKeys | id=searchInput | ${KEY_ENTER}
    driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
  }
}
