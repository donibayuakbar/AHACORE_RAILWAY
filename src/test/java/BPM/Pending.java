package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Pending extends mainBPM {

    @Test
    public void pending () throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Klik kunjungi outlet
            WebElement kunjungi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[3]/android.widget.Button")));
            kunjungi.click();
            Thread.sleep(2000);

            // Klik pending
            WebElement pending = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button"));
            pending.click();
            Thread.sleep(2000);

            // Input alasan
            WebElement alasan = driver.findElement(By.xpath("//android.widget.EditText"));
            alasan.click();
            alasan.sendKeys("Toko masih tutup karena survey terlalu subuh");
            Thread.sleep(2000);

            // Klik submit
            WebElement submit = driver.findElement(By.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
            submit.click();
            Thread.sleep(2000);

            //
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
