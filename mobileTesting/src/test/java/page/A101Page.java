package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobil;

public class A101Page {
    public A101Page() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverMobil.getBrowserDriver()),this);
    }
    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public MobileElement cerziKabulEt;
    @FindBy(xpath = "//a[@title='Menü']")
    public MobileElement menüButonu;
    @FindBy(xpath = "//a[@title='GİYİM & AKSESUAR']")
    public MobileElement giyimAksesuarButonu;
    @FindBy(xpath = "//a[contains(text(),'Kadın İç Giyim')]")
    public MobileElement kadinIcGiyimButonu;
    @FindBy(xpath = "(//li[@class='js-navigation-link '])[8]")
    public MobileElement dizAltiCorapButonu;
    @FindBy(xpath = "(//a[@title='Penti Kadın 50 Denye Pantolon Çorabı Siyah'])[1]")
    public MobileElement ilkUrun;
    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    public MobileElement urununDogrulugu;
    @FindBy(xpath = "//i[@class='icon-sepetekle']")
    public MobileElement urunuSepeteEkleme;
    @FindBy(xpath = "(//a[@title='Sepeti Görüntüle'])[2]")
    public MobileElement sepetiGoruntuleme;
    @FindBy(xpath = "//div[@onclick='personaSepetOpen();']")
    public MobileElement sepetteOzelUrunler;
    @FindBy(xpath = "(//a[@class='title'])[1]")
    public MobileElement sepettekilUrunlerinKontrolu;
    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[2]")
    public MobileElement sepetiOnaylaButonu;
    @FindBy(xpath = "//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public MobileElement uyeOlmadanDevamEtButonu;
    @FindBy(xpath = "//input[@name='user_email']")
    public MobileElement eMail;
    @FindBy(xpath = "//button[@class='button block green']")
    public MobileElement devamEtButonu;
    @FindBy(xpath = "(//a[@class='new-address js-new-address'])[1]")
    public MobileElement adresOlusturButonu;
    @FindBy(xpath = "//input[@placeholder='Ev adresim, iş adresim vb.']")
    public MobileElement adresBaslıgı;
    @FindBy(xpath = "//input[@name='first_name']")
    public MobileElement adi;
    @FindBy(xpath = "//input[@name='last_name']")
    public MobileElement soyadi;
    @FindBy(xpath = "//input[@name='phone_number']")
    public MobileElement cepTelefonu;
    @FindBy(xpath = "//select[@name='city']")
    public MobileElement ilSecimi;
    @FindBy(xpath = "//select[@name='township']")
    public MobileElement ilceSecimi;
    @FindBy(xpath = "//select[@class='js-district']")
    public MobileElement mahSecimi;
    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public MobileElement acıkAdres;
    @FindBy(xpath = "(//button[@type='button'])[6]")
    public MobileElement kaydetButonu;
    @FindBy(xpath = "(//div[@class='radio'])[3]")
    public MobileElement kargoSecimiSendeo;
    @FindBy(xpath = "(//div[@class='radio'])[4]")
    public MobileElement kargoSecimiMNG;
    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public MobileElement kaydetVeDevamEtButonu;
    /*





     */
}
