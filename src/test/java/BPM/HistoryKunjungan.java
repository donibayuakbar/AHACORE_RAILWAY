package BPM;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.time.Duration;

public class HistoryKunjungan extends mainBPM {

    @Test(priority = 1)
    public void historyKunjunganFilter() throws InterruptedException {
        try {
            // Klik Tambah
            Thread.sleep(5000);
            WebElement tambah = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Open menu\"]"));
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void historyKunjunganDetail() throws InterruptedException {
        try {
            // Scroll kebawah sampai mentok
            scrollToBottom();
            Thread.sleep(2000);

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

            // Klik detail unregistered outlet
            WebElement detail = driver.findElement(By.xpath("//android.widget.Button"));
            detail.click();
            Thread.sleep(2000);

            // Klik kembali
            WebElement back0 = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
            back0.click();
            Thread.sleep(2000);

            // Klik Kembali
            WebElement back = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View"));
            back.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fungsi untuk scroll sampai mentok ke bawah menggunakan TouchAction dengan batasan
    public void scrollToBottom() {
        Dimension size = driver.manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8); // Mulai dari 80% layar
        int endY = (int) (size.height * 0.2);   // Geser ke atas (20% layar)

        int maxScrolls = 3; // Batas maksimum scroll
        int scrollCount = 0;
        boolean foundFooter = false;

        while (!foundFooter && scrollCount < maxScrolls) {
            try {
                WebElement footer = driver.findElement(By.xpath("//android.widget.TextView[@text='Footer']")); // Sesuaikan XPath footer
                if (footer.isDisplayed()) {
                    System.out.println("Footer ditemukan!");
                    foundFooter = true;
                    break;
                }
            } catch (Exception e) {
                // Jika footer tidak ditemukan, lanjut scroll
            }

            // Lakukan swipe manual
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();

            scrollCount++;

            // Cek apakah layar sudah tidak bisa di-scroll lebih jauh
            if (scrollCount == maxScrolls) {
                System.out.println("Mencapai batas scroll, berhenti.");
                break;
            }
        }
    }
}
