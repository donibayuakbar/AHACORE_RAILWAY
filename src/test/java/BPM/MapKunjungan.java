package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MapKunjungan extends mainBPM {

    @Test
    public void MapKunjungan () throws InterruptedException {
        try {
            Thread.sleep(5000);
            // Klik Tambah
            WebElement tambah = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Open menu\"]"));
            tambah.click();
            Thread.sleep(2000);

            // Klik Map Kunjungan
            WebElement mapKunjungan = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Map Kunjungan\"]"));
            mapKunjungan.click();
            Thread.sleep(2000);

            // Klik tampilkan status kunjungan pada map
            WebElement status = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
            status.click();
            Thread.sleep(10000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
