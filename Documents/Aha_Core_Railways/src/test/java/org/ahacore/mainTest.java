package org.ahacore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class mainTest {
    public AndroidDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("King_Core");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("14.0");
        options.setApp("/Users/ahadev2/Documents/Aha_Core_Railways/src/test/java/resource/app preproduction.apk");

        // Inisialisasi driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);

        // Inisialisasi WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
