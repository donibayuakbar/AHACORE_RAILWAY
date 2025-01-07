package org.ahacore;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChectOutFull extends mainTest {

    @Test
    public void full () throws InterruptedException {
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
            for (int i = 1; i <= 5; i++){
                driver.findElement(By.xpath("(//android.widget.ImageButton[@resource-id=\"com.id.aha.app.preproduction:id/pp_product_ibtn_plus\"])[1]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("(//android.widget.ImageButton[@resource-id=\"com.id.aha.app.preproduction:id/pp_product_ibtn_plus\"])[2]")).click();
                Thread.sleep(1000);
            }
            driver.findElement(By.xpath("//android.widget.TextView[@text=\"Tambahkan Ke Keranjang\"]")).click();
            Thread.sleep(2000);

            // Produk Kedua
            driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.id.aha.app.preproduction:id/btn_buy\"])[6]")).click();
            Thread.sleep(2000);
            for (int i = 1; i <= 5; i++){
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
            driver.findElement(By.id("com.id.aha.app.preproduction:id/cart_btn_pay")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/item_ara_cb")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/purchase_detail_btn_next")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/payment_method_cod_cb_choice")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/payment_method_btn_pay")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/ahacash_success_btn_ok")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Kembali ke atas\"]")).click();
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
