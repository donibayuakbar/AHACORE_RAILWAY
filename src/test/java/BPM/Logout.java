package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Logout extends mainBPM {

    @Test
    public void logout () throws InterruptedException {
        try {
            Thread.sleep(5000);
            // Klik Logout
            WebElement logout = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Logout\"]"));
            logout.click();
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
