package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CekRute extends mainBPM {

    @Test
    public void rute () throws InterruptedException {
        try {
            Thread.sleep(5000);
            // Klik maps
            WebElement rute = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Google Map\"])[1]"));
            rute.click();
            Thread.sleep(2000);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
