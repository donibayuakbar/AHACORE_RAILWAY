package BPM;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import com.github.javafaker.Faker;

public class TambahUnregisteredOutlet extends mainBPM {

    @Test
    public void UnregisteredOutlet() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Faker faker = new Faker();

            // Generate data random
            String randomName = faker.name().fullName();
            String randomPhone = generateRandomPhoneNumber();
            String randomAddress = faker.address().fullAddress();

            // Klik Tambah
            WebElement tambah = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.Button")));
            tambah.click();
            Thread.sleep(2000);

            // Klik Tambah Unregistered Outlet
            WebElement unregisteredOutlet = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Tambah Unregistered Outlet\"]")));
            unregisteredOutlet.click();
            Thread.sleep(2000);

            // Ambil foto
            WebElement ambilFoto = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Ambil Foto\"]")));
            ambilFoto.click();
            Thread.sleep(2000);

            // Perijinan Kamera
            WebElement allow = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
            allow.click();
            Thread.sleep(2000);

            // Cekrek Foto
            WebElement cekrek = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.camera2:id/shutter_button")));
            cekrek.click();
            Thread.sleep(2000);

            // Foto berhasil
            WebElement done = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.camera2:id/done_button")));
            done.click();
            Thread.sleep(2000);

            // Input Nama (Random)
            WebElement nama = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[1]")));
            nama.click();
            nama.sendKeys(randomName);
            Thread.sleep(2000);

            // Input No HP (Random)
            WebElement hp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[2]")));
            hp.click();
            hp.sendKeys(randomPhone);
            Thread.sleep(2000);

            // Scroll ke teks "Submit"
            scrollToText("Alamat Toko");

            // Input Alamat Toko (Random)
            WebElement alamat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[3]")));
            alamat.click();
            alamat.sendKeys(randomAddress);
            Thread.sleep(2000);

            // Input Jenis Toko (Random dari daftar pilihan)
            WebElement jenis = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[4]")));
            jenis.click();
            List<String> jenisTokoList = Arrays.asList("Grosir", "Retail", "Minimarket", "Supermarket", "Toko Kelontong", "Warung");
            String randomJenisToko = jenisTokoList.get(new Random().nextInt(jenisTokoList.size()));
            jenis.sendKeys(randomJenisToko);
            System.out.println("Jenis Toko: " + randomJenisToko);
            Thread.sleep(2000);

            // Scroll sampai mentok ke bawah
            scrollToBottom();
            Thread.sleep(2000);

            // Pilih salah satu checkbox secara random
            pilihCheckboxRandom(wait);
            Thread.sleep(2000);

            // Klik Submit
            WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Submit\"]")));
            submit.click();
            Thread.sleep(4000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fungsi untuk scroll ke teks tertentu
    public void scrollToText(String text) {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + text + "\"))"
            ));
        } catch (Exception e) {
            System.out.println("Gagal scroll ke teks: " + text);
        }
    }

    // Fungsi untuk scroll sampai mentok ke bawah
    public void scrollToBottom() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
            ));
        } catch (Exception e) {
            System.out.println("Gagal scroll ke bawah.");
        }
    }

    // Fungsi untuk memilih salah satu checkbox secara random
    public void pilihCheckboxRandom(WebDriverWait wait) {
        List<String> checkboxXPathList = Arrays.asList(
                "//android.widget.TextView[@text=\"Download & Transaksi\"]",
                "//android.widget.TextView[@text=\"Hanya Download Aplikasi\"]",
                "//android.widget.TextView[@text=\"Belum Download\"]"
        );

        // Pilih salah satu checkbox secara random
        String randomCheckboxXPath = checkboxXPathList.get(new Random().nextInt(checkboxXPathList.size()));

        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(randomCheckboxXPath)));
        checkbox.click();
        System.out.println("Checkbox dipilih: " + randomCheckboxXPath);
    }

    // Fungsi untuk generate nomor HP random dengan format Indonesia
    public String generateRandomPhoneNumber() {
        Faker faker = new Faker();
        return "08" + faker.number().digits(9); // Nomor HP Indonesia dimulai dari "08" + 9 digit angka random
    }
}
