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
import java.time.Duration;

public class mainBPM {
    public AndroidDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Xiaomi 220333QPG");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("11.0");
        options.setApp("/Users/ahadev1/Documents/Aha_Core_Railways/src/test/java/resource/BPM18.apk");

        // Tambahan konfigurasi timeout
        options.setNewCommandTimeout(Duration.ofSeconds(60));
        options.setAutoWebview(false);
        options.setAdbExecTimeout(Duration.ofSeconds(30));

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            System.out.println("Driver initialized successfully");
            Thread.sleep(1000);

            // Izin aplikasi
//            driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'permission_allow')]")).click();
//            Thread.sleep(2000);
            driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'permission_allow_foreground_only')]")).click();
            Thread.sleep(2000);

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

        } catch (Exception e) {
            System.out.println("Failed to initialize driver: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    @AfterClass
    public void penutupan() {
        if (driver != null) {
            driver.quit();
        }
    }
}