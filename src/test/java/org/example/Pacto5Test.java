package org.example;// Generated by Selenium IDE

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class Pacto5Test extends PactometroPaginaPrincipal {
 /* private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\blalvare\\OneDrive - Capgemini\\Desktop\\chromedriver\\chromedriver.exe");

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }*/

  @Test
  public void pacto5() {
    // Test name: pacto5
    // Step # | name | target | value
    // 1 | open | /pactometro/ | 
    //driver.get("https://cursosdedesarrollo.com/pactometro/");
    // 2 | setWindowSize | 802x824 | 
   // driver.manage().window().setSize(new Dimension(802, 824));

    // 3 | click | css=#part-PNV > img | 
    botonPNV.click();

    // 4 | click | id=abst | 
  abst.click();
    // 5 | assertElementNotPresent | id=#part-PNV | 
    {
      List<WebElement> elements = atributoPNV;
      assert(elements.size() == 0);
    }
    //botonPNV  = driver.findElement(By.id("part-PNV"));
    // System.out.println(botonPP.getAttribute("disabled"));
    Assertions.assertEquals("true", botonPNV.getAttribute("disabled"));

    // 6 | click | css=img:nth-child(3) | 
    //driver.findElement(By.cssSelector("img:nth-child(3)")).click();
    // 7 | click | id=partidos | 
    partidos.click();
    // 8 | click | id=reset | 
    reset.click();
    // 9 | click | id=num-abst | 
   numabst.click();
    // 10 | click | id=num-abst | 
   numabst.click();
    // 11 | assertText | id=num-abst | 0
    assertEquals("0", numabst.getText());
    // 12 | click | id=noes | 
   noes.click();
  }
}
