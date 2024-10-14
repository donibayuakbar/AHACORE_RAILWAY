package org.ahacore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginOTP extends mainTest {

        @Test
        public void login() throws InterruptedException {
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/dialog_no_connection_btn_try_again")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
            Thread.sleep(3000);

            driver.findElement(By.id("com.id.aha.app.preproduction:id/form_button_login")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_login")).click();
            Thread.sleep(3000);

            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
            Thread.sleep(2000);
            WebElement firstElement = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.id.aha.app.preproduction:id/edt_email\"]"));
            firstElement.click();
            firstElement.sendKeys("087779888983");
            //driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_login")).sendKeys("087779888983");
            Thread.sleep(5000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/login_btn_login")).click();
            Thread.sleep(3000);

            driver.findElement(By.id("com.id.aha.app.preproduction:id/otp_pin_edt")).sendKeys("142536");
            Thread.sleep(3000);
        }
}
