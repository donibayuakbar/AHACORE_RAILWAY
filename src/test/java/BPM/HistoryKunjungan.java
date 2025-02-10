package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HistoryKunjungan extends mainBPM {

    @Test (priority = 1)
    public void historyKunjunganFilter () throws InterruptedException {
        try {
            // Klik Tambah
            Thread.sleep(2000);
            WebElement tambah = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.Button"));
            tambah.click();
            Thread.sleep(2000);

            // Klik History Kunjungan
            WebElement history = driver.findElement(By.xpath("//android.widget.TextView[@text=\"History Kunjungan\"]"));
            history.click();
            Thread.sleep(2000);

            // Klik filter Kunjungan
            WebElement filter = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
            filter.click();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test (priority = 2)
    public void historyKunjunganDetail () throws InterruptedException {
        try {
            // Klik Tanggal Kunjungan
            WebElement tgl = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Open Outlet\"])[1]"));
            tgl.click();
            Thread.sleep(2000);

            // Input cari toko
            WebElement cari = driver.findElement(By.xpath("//android.widget.EditText"));
            cari.click();
            cari.sendKeys("Toko Grosir");
            Thread.sleep(2000);

            // Clear Text
            WebElement clear = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Clear Text\"]"));
            clear.click();
            Thread.sleep(2000);

            // Klik Kembali
            WebElement back = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View"));
            back.click();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
