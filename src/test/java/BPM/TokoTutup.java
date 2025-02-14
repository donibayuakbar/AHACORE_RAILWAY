package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TokoTutup extends mainBPM {

    @Test
    public void tokoTutupBatal () throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Klik kunjungi outlet
            WebElement kunjungi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.TextView[@text=\"Kunjungi Outlet\"])[1]")));
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

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void tokoTutupJadi () throws InterruptedException {
        try {
            // Klik kunjungi outlet
            WebElement kunjungi = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[3]/android.widget.Button"));
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

            // Klik ambil foto
            WebElement ambilFoto = driver.findElement(By.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
            ambilFoto.click();
            Thread.sleep(2000);

            // tap Foto
            WebElement tapFoto = driver.findElement(By.id("com.android.camera2:id/shutter_button"));
            tapFoto.click();
            Thread.sleep(2000);

            // Klik done
            WebElement done = driver.findElement(By.id("com.android.camera2:id/done_button"));
            done.click();
            Thread.sleep(2000);

            // Klik submit
            WebElement submit = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]"));
            submit.click();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
