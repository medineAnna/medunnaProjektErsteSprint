Feature:

  Background:
    Given kullanici "medunnaUrl" adresine gider
    And giris icin giris ikonuna tiklar
    And ana sayfa Sign In butonuna tiklar
    And username olarak "gaziUsername" girer
    And password olarak "gaziPassword" girer
    Then Sign In butonuna tiklar
    And kullanici oturumu kapatir



    Scenario:
      Given giris icin giris ikonuna tiklar
      And ana sayfa Sign In butonuna tiklar
      And beni hatirla secenegini gorur
      And Did you forget your password secenegini gorur
      And Register a new Account secenegini gorur
      Then Cancel buttonunu gorur
      And kullanici browseri kapatir