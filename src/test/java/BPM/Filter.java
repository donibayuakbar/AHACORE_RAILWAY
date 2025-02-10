package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Filter extends mainBPM {

    @Test
    public void filter () throws InterruptedException {
        try {
            // klik filter
            WebElement filter1 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Filter\"]"));
            filter1.click();
            Thread.sleep(2000);

            // Klik jarak
            WebElement jarak = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Terjauh - Terdekat\"]"));
            jarak.click();
            Thread.sleep(2000);

            // Klik status
            WebElement status = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Belum Dikunjungi - Sudah Dikunjungi\"]"));
            status.click();
            Thread.sleep(2000);

            // Klik terapkan
            WebElement terapkan = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Terapkan\"]"));
            terapkan.click();
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void reset () throws InterruptedException {
        try {

            // Klik filter
            WebElement filter2 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Filter\"]"));
            filter2.click();
            Thread.sleep(2000);

            // Klik Reset
            WebElement reset = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Reset\"]"));
            reset.click();
            Thread.sleep(4000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
