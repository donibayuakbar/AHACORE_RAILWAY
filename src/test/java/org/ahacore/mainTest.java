package org.ahacore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class mainTest {
    public AndroidDriver driver;
    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("DoniPhone");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("14.0");
        options.setApp("/Users/ahadev1/Documents/Aha_Core_Railways/src/test/java/resource/preprod.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        Thread.sleep(5000);
    }
    @AfterClass
    public void penutupan() {
        driver.quit();
    }
}
