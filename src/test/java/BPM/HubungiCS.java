package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HubungiCS extends mainBPM{

    @Test
    public void CS () throws InterruptedException {
        try {
            // Klik Tambah
            WebElement tambah = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.Button"));
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
