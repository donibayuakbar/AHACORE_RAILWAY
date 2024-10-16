package org.ahacore;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckOutUnchecklistAll extends mainTest{

    @Test
    public void unchecklist () throws InterruptedException {
        try {
            // Produk Pertama
            Thread.sleep(2000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_ok")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_ok")).click();
            Thread.sleep(2000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Lihat 50 produk trending\"));"));
            Thread.sleep(2000);

            // Lihat 50 Produk trending
            driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.id.aha.app.preproduction:id/dashboard_show_more_popular\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.id.aha.app.preproduction:id/btn_buy\"])[5]")).click();
            Thread.sleep(2000);
            for (int i = 1; i <= 5; i++) {
                driver.findElement(By.xpath("(//android.widget.ImageButton[@resource-id=\"com.id.aha.app.preproduction:id/pp_product_ibtn_plus\"])[1]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("(//android.widget.ImageButton[@resource-id=\"com.id.aha.app.preproduction:id/pp_product_ibtn_plus\"])[2]")).click();
                Thread.sleep(1000);
            }
            driver.findElement(By.xpath("//android.widget.TextView[@text=\"Tambahkan Ke Keranjang\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Kembali ke atas\"]")).click();
            Thread.sleep(2000);

             // Button Keranjang
             driver.findElement(By.id("com.id.aha.app.preproduction:id/cartFragment")).click();
             Thread.sleep(2000);
             driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.id.aha.app.preproduction:id/list_item_cart_cb\"])[1]")).click();
             Thread.sleep(1000);
             driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.id.aha.app.preproduction:id/list_item_cart_cb\"])[2]")).click();
             Thread.sleep(1000);
             driver.findElement(By.id("com.id.aha.app.preproduction:id/cart_btn_pay")).click();
             Thread.sleep(2000);
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
