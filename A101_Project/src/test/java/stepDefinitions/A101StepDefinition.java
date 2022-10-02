package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class A101StepDefinition {
    A101Page a101Page= new A101Page();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker= new Faker();

    @Given("Kullanici istenen <{string}> gider")
    public void kullanici_istenen_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
        a101Page.cerezKabul.click();

        try {
                a101Page.gormedenCikmaCerez.click();
        } catch (Exception e) {
            e.printStackTrace();
        }





    }
    @When("kullanici GİYİM & AKSESUAR'i tiklar")
    public void kullanici_gi̇yi̇m_aksesuar_i_tiklar() {
        a101Page.giyimAksesuarButonu.click();

    }
    @Then("Kullanici kadin icgiyim'i tiklar")
    public void kullanici_kadin_icgiyim_i_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        a101Page.kadinIcGiyimButonu.click();

    }
    @Then("Kullanici dizalti corap'i tiklar")
    public void kullanici_dizalti_corap_i_tiklar() {
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithTimeOut(a101Page.dizaltiCorap,10);

        ReusableMethods.waitFor(3);
    }
    @Then("Kullanici ilk urunu tiklar")
    public void kullanici_ilk_urunu_tiklar() {
        a101Page.ilkUrun.click();

    }
    @Then("Kullanici urunun siyah corap oldugunu dogrular")
    public void kullanici_urunun_siyah_corap_oldugunu_dogrular() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(a101Page.eklenenUrunDogrulugu.getText().contains("Siyah"));

    }
    @Then("Kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {
        a101Page.sepeteEkleme.click();

    }
    @Then("Kullanici sepeti goruntule butonunu tiklar")
    public void kullanici_sepeti_goruntule_butonunu_tiklar() {
        a101Page.sepetGoruntule.click();

    }
    @Then("Kullanici sepetindeki urunu dogrular ve sepeti onayla butonuna tiklar")
    public void kullanici_sepetindeki_urunu_dogrular_ve_sepeti_onayla_butonuna_tiklar() {
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(a101Page.sepettekiUrununDogruMu.getText().contains("Penti Kadın 50 Denye Pantolon Çorabı Siyah"));

        a101Page.sepetiOnayla.click();

    }
    @Then("Kullanici uye olmadan devam et butonunu tiklar")
    public void kullanici_uye_olmadan_devam_et_butonunu_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(a101Page.uyeOlmadanDevamEt,3);
        a101Page.uyeOlmadanDevamEt.click();


    }
    @Then("Kullanici mail adresini girer ve devam et butonunu tiklar")
    public void kullanici_mail_adresini_girer_ve_devam_et_butonunu_tiklar() {
        actions.click(a101Page.eMail).
                sendKeys(faker.internet().emailAddress()).perform();
        a101Page.devamEtButonu.click();

    }
    @Then("Kullanici adres olustur butonunu tiklara")
    public void kullanici_adres_olustur_butonunu_tiklara() {
        a101Page.yeniadresGirisButonu.click();

    }
    @Then("Kullanici Adres Başlığı Ad soyad Cep Telefonu Il Ilce Mah Adres kisimlarini doldurup kaydet butonuna tiklar")
    public void kullanici_adres_başlığı_ad_soyad_cep_telefonu_il_ilce_mah_adres_kisimlarini_doldurup_kaydet_butonuna_tiklar() {

        a101Page.adresBasligi.sendKeys("Ev",Keys.TAB);
            a101Page.ad.sendKeys(faker.name().firstName(),Keys.TAB);
            a101Page.soyad.sendKeys(faker.name().lastName(),Keys.TAB);
            a101Page.cepTelefonu.sendKeys(faker.phoneNumber().cellPhone(),Keys.TAB);

        Random random= new Random();
        //il secimi
            Select selectIlSecimi= new Select(a101Page.ilSecimi);
            List<WebElement> ilSecimi=selectIlSecimi.getOptions();
            int rastgeleIlSec=random.nextInt(ilSecimi.size());
            ilSecimi.get(rastgeleIlSec).click();
            ReusableMethods.waitFor(3);
            a101Page.ilSecimi.click();
            //ilce secimi
        Select selectIlceSecimi= new Select(a101Page.ilceSecimi);
        List<WebElement> ilceSecimi=selectIlceSecimi.getOptions();
        int rastgeleIlceSec=random.nextInt(ilceSecimi.size());
        ilceSecimi.get(rastgeleIlceSec).click();
        ReusableMethods.waitFor(3);

        a101Page.mahSecimi.click();
        //mah secimi
        Select selectMahSecimi= new Select(a101Page.mahSecimi);
        selectMahSecimi.selectByIndex(2);
       /* List<WebElement> mahSecimi=selectMahSecimi.getOptions();
        int rastgeleMahSec=random.nextInt(mahSecimi.size());
        ReusableMethods.waitFor(3);
       // js.executeScript("arguments[0].click();", ilceSecimi.get(rastgeleMahSec));
        ReusableMethods.waitForClickablility(ilceSecimi.get(rastgeleMahSec),5);
        ilceSecimi.get(rastgeleMahSec).click();
        */
        a101Page.adres.sendKeys(faker.address().fullAddress());
        a101Page.kaydetButonu.click();


    }
    @Then("Kullanici kargo secimini yapar ve devam butonunu tiklar")
    public void kullanici_kargo_secimini_yapar_ve_devam_butonunu_tiklar() {
        ReusableMethods.waitFor(3);
        if(!a101Page.sendeoKargo.isSelected()){
            a101Page.sendeoKargo.click();
        }
        a101Page.kaydetVeDevamEtButonu.click();

    }
    @Then("Kullanici odeme sayfasinda oldugunu dogrular")
    public void kullanici_odeme_sayfasinda_oldugunu_dogrular() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expecdetUrl="https://www.a101.com.tr/orders/checkout/";
        Assert.assertEquals(expecdetUrl,actualUrl);
        ReusableMethods.waitFor(3);

    }


}
