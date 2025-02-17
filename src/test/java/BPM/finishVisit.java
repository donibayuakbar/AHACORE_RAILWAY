package BPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class finishVisit extends mainBPM {

    @Test
    public void finishVisit () throws InterruptedException {
        try {

            //Klik Finish Visit
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement finish = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Finish Visit\"]")));
            finish.click();
            Thread.sleep(4000);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
