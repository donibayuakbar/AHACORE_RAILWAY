package BPM;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class mainBPM {
    public AndroidDriver driver;
    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("BayuDevice");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("14.0");
        options.setApp("/Users/ahadev1/Documents/Aha_Core_Railways/src/test/java/resource/BPMdev.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        Thread.sleep(2000);

        // pembukaan android
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
        Thread.sleep(1000);

        // Login user
        WebElement userName = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
        userName.click();
        userName.sendKeys("BPM Doni");
        Thread.sleep(1000);
        WebElement passWord = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
        passWord.click();
        passWord.sendKeys("Admin123");
        Thread.sleep(1000);
        WebElement Submit = driver.findElement(By.className("android.widget.Button"));
        Submit.click();
        Thread.sleep(3000);
    }
    @AfterClass
    public void penutupan () {
        driver.quit();
    }
}
