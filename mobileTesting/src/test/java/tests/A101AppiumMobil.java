package tests;

import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.A101Page;
import utilities.ConfigReader;
import utilities.DriverMobil;
import utilities.ReusableMethods;

public class A101AppiumMobil {
    A101Page a101Page= new A101Page();
    Faker faker =new Faker();
    Select select;
    @Test
    public void test01() throws InterruptedException {
        //kullanıcı anasayfaya gider
        DriverMobil.getBrowserDriver().get(ConfigReader.getProperty("a101Url"));
        //kullanıcı cerezikabul eder
        a101Page.cerziKabulEt.click();
        Thread.sleep(7000);

        TouchAction tActionp=new TouchAction<>(DriverMobil.getBrowserDriver());
        // Kullanıcı bildirimleri kabul eder
        tActionp.tap(PointOption.point(910,1038)).perform();
        Thread.sleep(7000);
        //kullanıcı menü butonuna tıklar
        a101Page.menüButonu.click();
        Thread.sleep(7000);
        //kullanıcı gıyım aksesuar bolumunu tıklar
        a101Page.giyimAksesuarButonu.click();
        Thread.sleep(7000);
        // kullanıcı kadın ıc gıyımı tıklar
        a101Page.kadinIcGiyimButonu.click();
        Thread.sleep(7000);
        // kullanıcı Dizaltı Çorabı tıklar
        a101Page.dizAltiCorapButonu.click();
        Thread.sleep(9000);
        //kullanıcı ilk ürünü tıklar
       a101Page.ilkUrun.click();
        Thread.sleep(7000);
        //ilk urunun siyah corap oldugunu dogrular
        Assert.assertTrue(a101Page.urununDogrulugu.getText().contains("Siyah"));
        Thread.sleep(7000);
        //kullanıcı urunu sepete ekler
        a101Page.urunuSepeteEkleme.click();
        Thread.sleep(7000);
        //kullanıcı sebeti görüntüleyi tiklar
        a101Page.sepetiGoruntuleme.click();
        Thread.sleep(7000);
        //sepete özel ürünleri kapat
        a101Page.sepetteOzelUrunler.click();
        Thread.sleep(9000);
        //kullanıcı sebetindeki ürünün dogrulugunu test eder
        Assert.assertTrue(a101Page.sepettekilUrunlerinKontrolu.getText().contains("Pantolon Çorabı Siyah"));
        Thread.sleep(7000);
        //kullanıcı sepeti onaylar
        a101Page.sepetiOnaylaButonu.click();
        Thread.sleep(7000);
        //kullanıcı üye olmadan devam eti tıklar
        a101Page.uyeOlmadanDevamEtButonu.sendKeys(Keys.ENTER);
        Thread.sleep(7000);
        //kullanıcı mail adresini girer
        a101Page.eMail.sendKeys(faker.internet().emailAddress());
        Thread.sleep(7000);
        //kullanıcı Devam Et butonunu tıklar
        a101Page.devamEtButonu.click();
        Thread.sleep(7000);
        //kullanıcı yeni adres olustur butonunu tıklar
        a101Page.adresOlusturButonu.click();
        Thread.sleep(7000);
        //kullanıcı adres bilgilerini girer
        Thread.sleep(7000);
        //kullanıcı adres bilgilerini girer
        Thread.sleep(7000);
        //adres başligi
        a101Page.adresBaslıgı.sendKeys("Ev");
        Thread.sleep(7000);
        //ad
        a101Page.adi.sendKeys(faker.name().firstName(),Keys.TAB);
        Thread.sleep(7000);
        //soyad
        a101Page.soyadi.sendKeys(faker.name().lastName(),Keys.TAB);
        Thread.sleep(7000);
        //cep Telefonu
        a101Page.cepTelefonu.sendKeys("555555-5555",Keys.TAB);
        Thread.sleep(7000);
        //il seçimi
        ReusableMethods.selectByVisibleText(a101Page.ilSecimi,"ANKARA");

        Thread.sleep(7000);
        //ilçe seçimi
        ReusableMethods.selectByVisibleText(a101Page.ilceSecimi,"SİNCAN");

        Thread.sleep(7000);
        //mah secimi
        ReusableMethods.selectByVisibleText(a101Page.mahSecimi,"YUNUS EMRE MAH");

        Thread.sleep(7000);
        //adres bilgileri
        a101Page.acıkAdres.sendKeys("280 sok harika apt kat :3 daire:5");
        Thread.sleep(7000);
        //kullanıcı kaydet butonunu tıklar
        a101Page.kaydetButonu.click();
        Thread.sleep(7000);
        //kullanıcı kargo secimi yapar
        a101Page.kargoSecimiSendeo.click();
        Thread.sleep(7000);
        //kullanıcı kaydet ve devam et butonuna tıklar
        a101Page.kaydetVeDevamEtButonu.click();
        Thread.sleep(7000);

        //kullanıcı odeme sayfasında oldugunu test eder
        String actualUrl= DriverMobil.getBrowserDriver().getCurrentUrl();
        String expectedUrl="https://www.a101.com.tr/orders/checkout/";
        Assert.assertEquals(actualUrl,expectedUrl);
        Thread.sleep(7000);
        DriverMobil.getBrowserDriver().quit();


    }
}
