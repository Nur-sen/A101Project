package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class A101Page {
    public A101Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement giyimAksesuarButonu;

    @FindBy(xpath = "(//button[@class='CybotCookiebotDialogBodyButton'])[2]")
    public  WebElement cerezKabul;

    @FindBy(xpath = "(//a[@class='js-filter-link '])[2]")
    public WebElement kadinIcGiyimButonu;

    @FindBy(xpath = "(//a[@class='js-filter-link '])[2]")
    public WebElement dizaltiCorap;

    @FindBy(xpath = "//div[@class='closePopupPersona']")
    public  WebElement gormedenCikmaCerez;

    @FindBy(xpath = "//div[@class='product-actions']")
    public  WebElement ilkUrun;
    @FindBy(xpath = "//h1[text()='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    public  WebElement eklenenUrunDogrulugu;

    @FindBy(xpath = "//i[@class='icon-sepetekle']")
    public WebElement sepeteEkleme;

    @FindBy(xpath = "(//a[@title='Sepeti Görüntüle'])[2]")
    public  WebElement sepetGoruntule;

    @FindBy(xpath = "(//a[@title='Penti Kadın 50 Denye Pantolon Çorabı Siyah'])[3]")
    public  WebElement sepettekiUrununDogruMu;

    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[2]")
    public  WebElement sepetiOnayla;

    @FindBy(xpath = "//a[@title=\"ÜYE OLMADAN DEVAM ET\"]")
    public  WebElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    public  WebElement eMail;

    @FindBy(xpath = "//button[@class='button block green']")
    public  WebElement devamEtButonu;

    @FindBy(xpath = "(//a[@class='new-address js-new-address'])[1]")
    public WebElement yeniadresGirisButonu;

    @FindBy(xpath = "//input[@placeholder='Ev adresim, iş adresim vb.']")
    public  WebElement adresBasligi;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement ad;

    @FindBy(xpath ="//input[@name='last_name']")
    public  WebElement soyad;

    @FindBy(xpath = "//input[@name='phone_number']")
    public  WebElement cepTelefonu;

    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public WebElement adres;
    @FindBy(xpath = "//span[@class='address-modal__input--invalid']")
    public WebElement buAlanıBosBırakamazsınızText;
    @FindBy(xpath = "//select[@class='js-cities']")
    public WebElement ilSecimi;

    @FindBy(xpath = "//select[@class='js-township']")
    public  WebElement ilceSecimi;

    @FindBy(xpath = "//select[@class='js-district']")
    public WebElement mahSecimi;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement kaydetButonu;

    @FindBy(xpath = "(//div[@class='radio'])[3]")
    public  WebElement sendeoKargo;
    @FindBy (xpath = "(//div[@class='radio'])[4]")
    public WebElement mngKargo;
    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public WebElement kaydetVeDevamEtButonu;
    @FindBy(xpath = "//div[@class='error js-error-shipping_option']")
    public WebElement buAlanGerekliText;
}
