package ru.netology;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HappyPath {
    private WebDriver driver;

//    ChromeOptions options = new ChromeOptions();
//    options.addArguments("--disable-dev-shm-usage");
//    options.addArguments("--no-sandbox");
//    options.addArguments("--headless");
//    driver = new ChromeDriver(options);


    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        ChromeDriver driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    public void shouldSentForm() {
        driver.get("http://localhost:9999/");



    }
}
