package org.ahacore;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckOutPartial extends mainTest {

    @Test
    public void partial () throws InterruptedException {
        try {
            // Produk Pertama
            Thread.sleep(1000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_ok")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/btn_ok")).click();
            Thread.sleep(2000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Royco Kaldu Ayam Sachet 8 gr\"));"));
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.id.aha.app.preproduction:id/btn_buy\"])[5]")).click();
            Thread.sleep(2000);
            for (int i = 1; i <= 5; i++){
                driver.findElement(By.xpath("(//android.widget.ImageButton[@resource-id=\"com.id.aha.app.preproduction:id/pp_product_ibtn_plus\"])[1]")).click();
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
            driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.id.aha.app.preproduction:id/pp_product_button_add_to_cart\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.id.aha.app.preproduction:id/navigation_bar_item_icon_view\"])[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.id.aha.app.preproduction:id/list_item_cart_cb\"])[3]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.id.aha.app.preproduction:id/list_item_cart_cb\"])[4]")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("com.id.aha.app.preproduction:id/cart_btn_pay")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("com.id.aha.app.preproduction:id/item_ara_cb")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("com.id.aha.app.preproduction:id/purchase_detail_btn_next")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("com.id.aha.app.preproduction:id/payment_method_cod_cb_choice")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("com.id.aha.app.preproduction:id/payment_method_btn_pay")).click();
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
