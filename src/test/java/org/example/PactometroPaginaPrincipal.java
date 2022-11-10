package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PactometroPaginaPrincipal {
    private WebDriver driver;
    private Map<String, Object> vars;

    WebElement botonPNV;
    List<WebElement> atributoPNV;

    WebElement partidos;
    WebElement reset;
    WebElement numabst;
    WebElement noes;
    WebElement abst;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\blalvare\\OneDrive - Capgemini\\Desktop\\chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        navegapagina();
        getElements();
    }
    @AfterEach
    public void tearDown() {

        driver.quit();
    }
    public void navegapagina() {
        driver.get("https://cursosdedesarrollo.com/pactometro/");
        driver.manage().window().setSize(new Dimension(802, 824));

    }
    public void getElements() {
        botonPNV = driver.findElement(By.id("part-PNV"));
       atributoPNV = driver.findElements(By.id("#part-PNV"));
        partidos = driver.findElement(By.id("partidos"));
        reset = driver.findElement(By.id("reset"));
        numabst = driver.findElement(By.id("num-abst"));
        noes = driver.findElement(By.id("noes"));
        abst = driver.findElement(By.id("abst"));

    }

}
