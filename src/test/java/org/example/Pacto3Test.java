package org.example;// Generated by Selenium IDE

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
public class Pacto3Test {
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
  public void pacto3() {
    // Test name: pacto3
    // Step # | name | target | value
    // 1 | open | /pactometro/ | 
    driver.get("https://cursosdedesarrollo.com/pactometro/");
    // 2 | setWindowSize | 798x824 | 
    driver.manage().window().setSize(new Dimension(798, 824));
    // 3 | click | css=#part-PSOE > h2 | 
    driver.findElement(By.cssSelector("#part-PSOE > h2")).click();
    // 4 | click | id=part-Podemos | 
    driver.findElement(By.id("part-Podemos")).click();
    // 5 | click | id=sies | 
    driver.findElement(By.id("sies")).click();
    // 6 | assertElementPresent | id=sies | 
    {
      List<WebElement> elements = driver.findElements(By.id("sies"));
      assert(elements.size() > 0);
    }
  }
}
