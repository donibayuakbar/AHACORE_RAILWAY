package org.ahacore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class mainTest {
    public AndroidDriver driver;
    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("DoniDevice");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("14.0");
        options.setApp("/Users/ahadev1/Documents/Aha_Core_Railways/src/test/java/resource/app preproduction.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        Thread.sleep(2000);

        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.id.aha.app.preproduction:id/dialog_no_connection_btn_try_again")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("com.id.aha.app.preproduction:id/form_button_login")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_login")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        Thread.sleep(2000);
        WebElement firstElement = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.id.aha.app.preproduction:id/edt_email\"]"));
        firstElement.click();
        firstElement.sendKeys("085864528642");
        //driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_login")).sendKeys("087779888983");
        Thread.sleep(2000);
        driver.findElement(By.id("com.id.aha.app.preproduction:id/login_btn_login")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("com.id.aha.app.preproduction:id/otp_pin_edt")).sendKeys("123456");
        Thread.sleep(4000);
    }
    @AfterClass
    public void penutupan () {
        driver.quit();
    }
}
