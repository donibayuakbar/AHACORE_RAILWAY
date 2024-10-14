package org.ahacore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginOTP extends mainTest {

    @Test
    public void login() {
        // Tunggu dan klik tombol izinkan akses
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_button"))).click();

        // Tunggu dan klik tombol "Try Again" jika tidak ada koneksi
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.id.aha.app.preproduction:id/dialog_no_connection_btn_try_again"))).click();

        // Tunggu dan izinkan akses lokasi
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))).click();

        // Tunggu dan klik tombol "Login"
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.id.aha.app.preproduction:id/form_button_login"))).click();

        // Tunggu dan klik tombol "Login" pada halaman login
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.id.aha.app.preproduction:id/btn_login"))).click();

        // Isi input email atau nomor telepon
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id=\"com.id.aha.app.preproduction:id/edt_email\"]")));
        emailField.click();
        emailField.sendKeys("082293124747");

        // Klik tombol "Login" setelah memasukkan nomor
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.id.aha.app.preproduction:id/login_btn_login"))).click();

        // Masukkan kode OTP
        WebElement otpField = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.id.aha.app.preproduction:id/otp_pin_edt")));
        otpField.sendKeys("142536");
    }
}
