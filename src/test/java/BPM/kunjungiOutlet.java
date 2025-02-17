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

            // Market Survey by issue
            // klik tidak
            WebElement tidak = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.view.View[1]"));
            tidak.click();
            Thread.sleep(2000);

            // Isi Form
//            WebElement stok = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[1]"));
//            stok.click();
//            stok.sendKeys("10");
//            Thread.sleep(1000);
//
//            WebElement satuan = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Pilih satuan\"])[1]"));
//            satuan.click();
//            Thread.sleep(1000);
//            WebElement view = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Dus\"]"));
//            view.click();
//            Thread.sleep(1000);
//
//            WebElement tanggal = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Pilih tanggal\"]"));
//            tanggal.click();
//            WebElement klikTgl = driver.findElement(By.xpath("//android.view.View[@content-desc=\"15 Februari 2025\"]"));
//            klikTgl.click();
//            WebElement ok = driver.findElement(By.id("android:id/button1"));
//            ok.click();
//            Thread.sleep(1000);
//
//            WebElement qty = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[2]"));
//            qty.click();
//            qty.sendKeys("100");
//            Thread.sleep(2000);
//
//            WebElement satuan1 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.view.View[5]"));
//            satuan1.click();
//            Thread.sleep(1000);
//            WebElement view1 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Dus\"]"));
//            view1.click();
//            Thread.sleep(1000);
//
//            WebElement hargaBeli = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[3]"));
//            hargaBeli.click();
//            hargaBeli.sendKeys("230000");
//            Thread.sleep(1000);
//
//            scrollToBottom();
//            Thread.sleep(2000);
//
//            WebElement promo = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Masukkan promo yang didapat\"]"));
//            promo.click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[4]")).sendKeys("Tidak ada nih");
//            Thread.sleep(2000);

            // Klik lanjut
            WebElement lanjut3 = driver.findElement(By.xpath("//android.widget.Button"));
            lanjut3.click();
            Thread.sleep(2000);

            // Pertanyaan apakah pernah beli produk dari toko lain ?
            WebElement ada = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Ada\"]"));
            ada.click();
            Thread.sleep(2000);

            WebElement takefoto = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Ambil Foto\"]"));
            takefoto.click();
            Thread.sleep(2000);

            WebElement permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
            permission.click();
            Thread.sleep(2000);

            WebElement cameraButton0 = wait.until(ExpectedConditions.elementToBeClickable(
                    MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.camera:id/shutter_button\")")
            ));
            cameraButton0.click();
            Thread.sleep(5000);

            WebElement done0 = driver.findElement(By.id("com.android.camera:id/done_button"));
            done0.click();
            Thread.sleep(2000);

            WebElement keterangan = driver.findElement(By.className("android.widget.EditText"));
            keterangan.click();
            keterangan.sendKeys("Testing Brand Promotor");
            Thread.sleep(2000);

            scrollToBottom();
            Thread.sleep(2000);

            WebElement tambahProduk = driver.findElement(By.xpath("//android.widget.TextView[@text=\"+ Tambah Produk\"]"));
            tambahProduk.click();
            Thread.sleep(1000);

            scrollToBottom();
            Thread.sleep(3000);

            WebElement produk = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText[1]"));
            produk.click();
            Thread.sleep(2000);
            produk.sendKeys("Cat Choize Cat Food");
            Thread.sleep(2000);

            WebElement hargaBeli = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText[2]"));
            hargaBeli.click();
            Thread.sleep(2000);
            hargaBeli.sendKeys("250000");
            Thread.sleep(2000);

            WebElement Satuan = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText[3]"));
            Satuan.click();
            Thread.sleep(2000);
            Satuan.sendKeys("Karung");
            Thread.sleep(2000);

            // Klik lanjut
            WebElement lanjut4 = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button"));
            lanjut4.click();
            Thread.sleep(3000);

            // Request Produk
            WebElement tambahProduk1 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"+ Tambah Produk\"]"));
            tambahProduk1.click();
            Thread.sleep(2000);

            WebElement ambilFotoLagi = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Ambil Foto\"]"));
            ambilFotoLagi.click();
            Thread.sleep(2000);

            WebElement cameraButton1 = wait.until(ExpectedConditions.elementToBeClickable(
                    MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.camera:id/shutter_button\")")
            ));
            cameraButton1.click();
            Thread.sleep(2000);

            WebElement done1 = driver.findElement(By.id("com.android.camera:id/done_button"));
            done1.click();
            Thread.sleep(2000);

            WebElement masukanNama = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[1]"));
            masukanNama.click();
            masukanNama.sendKeys("Keranda");
            Thread.sleep(2000);

            scrollToBottom();
            Thread.sleep(3000);

            WebElement varian = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[2]"));
            varian.click();
            varian.sendKeys("Rasa Mayat");
            Thread.sleep(2000);

            WebElement Ukuran = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[3]"));
            Ukuran.click();
            Ukuran.sendKeys("Meter");
            Thread.sleep(2000);

            WebElement hargaBeli0 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[4]"));
            hargaBeli0.click();
            hargaBeli0.sendKeys("2500000");
            Thread.sleep(2000);

            WebElement satuan = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[5]"));
            satuan.click();
            satuan.sendKeys("Unit");
            Thread.sleep(2000);

            WebElement supplier = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[6]"));
            supplier.click();
            supplier.sendKeys("PT. Keranda Mayat");
            Thread.sleep(3000);

//            // Pop up lewatkan survey req produk ?
//            WebElement lewat = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Iya\"]"));
//            lewat.click();
//            Thread.sleep(2000);

            // Klik lanjut
            WebElement lanjutLagi = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
            lanjutLagi.click();
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

//            // Permission
//            WebElement permission1 = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
//            permission1.click();
//            Thread.sleep(3000);

            // Ambil foto
            WebElement ambilFoto = driver.findElement(By.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
            ambilFoto.click();
            Thread.sleep(2000);

            // Cekrek foto
            WebElement cameraButton2 = wait.until(ExpectedConditions.elementToBeClickable(
                    MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.camera:id/shutter_button\")")
            ));
            cameraButton2.click();
            Thread.sleep(2000);

            // Klik selesai
            WebElement selesai = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Selesai\"]"));
            selesai.click();
            Thread.sleep(2000);

//            // klik submit
//            WebElement submit = driver.findElement(By.xpath("//android.widget.Button"));
//            submit.click();
//            Thread.sleep(4000);

        } catch (Exception e) {
            System.out.println("❌ Terjadi kesalahan dalam proses kunjungi outlet.");
            e.printStackTrace();
        }
    }
    public void scrollToBottom() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
            ));
        } catch (Exception e) {
            System.out.println("Gagal scroll ke bawah.");
        }
    }
}
