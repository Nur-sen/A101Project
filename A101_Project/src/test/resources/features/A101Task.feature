Feature: A101 Kullanici Kaydi Yapmadan AlisVeris Yapmali
@a101
  Scenario: TC01 Kullanici A101 Sayfasindan siparis olusturur
    Given Kullanici istenen <"a101Url"> gider
    When  kullanici GİYİM & AKSESUAR'i tiklar
    Then Kullanici kadin icgiyim'i tiklar
    And Kullanici dizalti corap'i tiklar
    And Kullanici ilk urunu tiklar
    And Kullanici urunun siyah corap oldugunu dogrular
    And Kullanici urunu sepete ekler
    And Kullanici sepeti goruntule butonunu tiklar
    And Kullanici sepetindeki urunu dogrular ve sepeti onayla butonuna tiklar
    And Kullanici uye olmadan devam et butonunu tiklar
    And Kullanici mail adresini girer ve devam et butonunu tiklar
    And Kullanici adres olustur butonunu tiklara
    And Kullanici Adres Başlığı Ad soyad Cep Telefonu Il Ilce Mah Adres kisimlarini doldurup kaydet butonuna tiklar
    And Kullanici kargo secimini yapar ve devam butonunu tiklar
    And Kullanici odeme sayfasinda oldugunu dogrular


