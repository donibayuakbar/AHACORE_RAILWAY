package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HubungiCS extends mainBPM{

    @Test
    public void CS () throws InterruptedException {
        try {
            // Klik Tambah
            Thread.sleep(5000);
            WebElement tambah = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Open menu\"]"));
            tambah.click();
            Thread.sleep(2000);

            // Klik hubungi CS
            WebElement cs = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Hubungi CS\"]"));
            cs.click();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
