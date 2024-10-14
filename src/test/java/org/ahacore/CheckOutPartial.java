package org.ahacore;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckOutPartial extends mainTest {

    @Test
    public void partial () throws InterruptedException {
        try {
            Thread.sleep(1000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_ok")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_ok")).click();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
