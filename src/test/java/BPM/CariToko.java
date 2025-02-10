package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CariToko extends mainBPM {

    @Test
    public void searchToko () throws InterruptedException {
        try {
            Thread.sleep(2000);
            // cari Toko Pertama
            WebElement cari1 = driver.findElement(By.xpath( "//android.widget.EditText"));
            cari1.click();
            cari1.sendKeys("Toko Grosir");
            Thread.sleep(2000);
            WebElement clear1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Clear Text\"]"));
            clear1.click();
            Thread.sleep(2000);

            // Cari Toko Kedua
            WebElement cari2 = driver.findElement(By.xpath("//android.widget.EditText"));
            cari2.click();
            cari2.sendKeys("Toko Gatot Kaca");
            Thread.sleep(2000);
            WebElement clear2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Clear Text\"]"));
            clear2.click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
