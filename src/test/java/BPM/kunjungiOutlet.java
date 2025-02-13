package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class kunjungiOutlet extends mainBPM {

    @Test
    public void kunjungi() throws InterruptedException {
        try {
            // Klik kunjungi outlet
            WebElement kunjungi = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[3]/android.widget.Button"));
            kunjungi.click();
            Thread.sleep(2000);

            // Lanjut kunjungi
            WebElement lanjut = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button"));
            lanjut.click();
            Thread.sleep(3000);

            // Pertanyaan ada kendala terkait aplikasi AHA.id
            WebElement ask1 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Ada\"]"));
            ask1.click();
            Thread.sleep(2000);

            // Input pertanyaan
            WebElement input1 = driver.findElement(By.xpath("//android.widget.EditText"));
            input1.click();
            input1.sendKeys("Kapan AHA ID muncul di muka bumi?");
            Thread.sleep(2000);

            // Klik lanjut
            WebElement lanjut1 = driver.findElement(By.xpath("//android.widget.Button"));
            lanjut1.click();
            Thread.sleep(2000);

            // Ceklis semua checkbox
            try {
                // Simpan XPath dalam array agar lebih rapi
                String[] xpaths = {
                        "//android.widget.ScrollView/android.view.View[1]",
                        "//android.widget.ScrollView/android.view.View[2]",
                        "//android.widget.ScrollView/android.view.View[3]",
                        "//android.widget.ScrollView/android.view.View[4]",
                        "//android.widget.ScrollView/android.view.View[5]",
                        "//android.widget.ScrollView/android.view.View[6]",
                        "//android.widget.ScrollView/android.view.View[7]"
                };

                // Loop untuk klik semua checkbox
                for (String xpath : xpaths) {
                    WebElement checkbox = driver.findElement(By.xpath(xpath));

                    // Pastikan checkbox belum dicentang sebelum klik
                    if (checkbox.getAttribute("checked").equals("false")) {
                        checkbox.click();
                        System.out.println("✅ Checkbox dicentang: " + xpath);
                    } else {
                        System.out.println("✔ Checkbox sudah dicentang: " + xpath);
                    }
                }
                System.out.println("🎉 Semua checkbox berhasil dicentang!");

                // Klik lanjut setelah ceklis checkbox
                WebElement lanjut2 = driver.findElement(By.xpath("//android.widget.Button"));
                lanjut2.click();
                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan saat mencentang checkbox.");
                e.printStackTrace();
            }

            // Klik tidak jual produk ini
            WebElement tidakjual = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.view.View[1]"));
            tidakjual.click();
            Thread.sleep(2000);

            // Klik lanjut
            WebElement lanjut3 = driver.findElement(By.xpath("//android.widget.Button"));
            lanjut3.click();
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("❌ Terjadi kesalahan dalam proses kunjungi outlet.");
            e.printStackTrace();
        }
    }
}
