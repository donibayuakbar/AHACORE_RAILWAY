package BPM;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TokoTutup extends mainBPM {

    @Test (priority = 1)
    public void tokoTutupBatal () throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Klik kunjungi outlet
            WebElement kunjungi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.TextView[@text=\"Kunjungi Outlet\"])[2]")));
            kunjungi.click();
            Thread.sleep(2000);

            // Klik Toko Tutup
            WebElement tutup = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Toko Tutup\"]"));
            tutup.click();
            Thread.sleep(2000);

            // Perizinan
            WebElement perizinan = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
            perizinan.click();
            Thread.sleep(1000);

            // Klik batal
            WebElement batal = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Batal\"]"));
            batal.click();
            Thread.sleep(2000);

            System.out.println("Test case pertama berhassil");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test (priority = 2)
    public void tokoTutupJadi () throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Klik Toko Tutup
            WebElement tutup = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Toko Tutup\"]"));
            tutup.click();
            Thread.sleep(2000);

            // Klik ambil foto
            WebElement ambilFoto = driver.findElement(By.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
            ambilFoto.click();
            Thread.sleep(2000);

            // Tap camera
            WebElement cameraButton = wait.until(ExpectedConditions.elementToBeClickable(
                    MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.camera:id/shutter_button\")")
            ));
            cameraButton.click();
            Thread.sleep(2000);

            // Foto berhasil
            WebElement done = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.camera:id/done_button")));
            done.click();
            Thread.sleep(3000);

            // Klik submit
            WebElement submit = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]"));
            submit.click();
            Thread.sleep(4000);

            System.out.println("Test case kedua berhassil");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
