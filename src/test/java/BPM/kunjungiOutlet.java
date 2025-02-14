package BPM;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class kunjungiOutlet extends mainBPM {

    @Test
    public void kunjungi() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Klik kunjungi outlet
            WebElement kunjungi =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.TextView[@text=\"Kunjungi Outlet\"])[1]")));
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
                        "//android.widget.ScrollView/android.view.View[7]",
                        "//android.widget.ScrollView/android.view.View[8]"
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

            // Pertanyaan apakah pernah beli produk dari toko lain ?
            WebElement tidak = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Tidak Ada\"]"));
            tidak.click();
            Thread.sleep(2000);

            // Klik lanjut
            WebElement lanjut4 = driver.findElement(By.xpath("//android.widget.Button"));
            lanjut4.click();
            Thread.sleep(2000);

            // Klik skip
            WebElement skip = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button"));
            skip.click();
            Thread.sleep(2000);

            // Pop up lewatkan survey req produk ?
            WebElement lewat = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Iya\"]"));
            lewat.click();
            Thread.sleep(2000);

            // Sembunyikan target marketing dan cekllis
            WebElement hide = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sembunyikan\"]"));
            hide.click();
            Thread.sleep(1000);
            WebElement ceklis = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]"));
            ceklis.click();
            Thread.sleep(1000);

            // Simpan
            WebElement simpan = driver.findElement(By.xpath("//android.widget.Button"));
            simpan.click();
            Thread.sleep(3000);

            // Permission
            WebElement permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
            permission.click();
            Thread.sleep(2000);

            // Ambil foto
            WebElement ambilFoto = driver.findElement(By.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
            ambilFoto.click();
            Thread.sleep(2000);

            // Cekrek foto
            WebElement cameraButton = wait.until(ExpectedConditions.elementToBeClickable(
                    MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.camera:id/shutter_button\")")
            ));
            cameraButton.click();
            Thread.sleep(2000);

            // Klik selesai
            WebElement selesai = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Selesai\"]"));
            selesai.click();
            Thread.sleep(2000);

            // klik submit
            WebElement submit = driver.findElement(By.xpath("//android.widget.Button"));
            submit.click();
            Thread.sleep(4000);

        } catch (Exception e) {
            System.out.println("❌ Terjadi kesalahan dalam proses kunjungi outlet.");
            e.printStackTrace();
        }
    }
}
